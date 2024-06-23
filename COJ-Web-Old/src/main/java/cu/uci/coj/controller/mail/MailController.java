package cu.uci.coj.controller.mail;

import java.security.Principal;
import java.text.DateFormat;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import cu.uci.coj.utils.Notification;

import atg.taglib.json.util.JSONException;
import atg.taglib.json.util.JSONObject;
import cu.uci.coj.controller.BaseController;
import cu.uci.coj.dao.MailDAO;
import cu.uci.coj.dao.UserDAO;
import cu.uci.coj.mail.MailNotificationService;
import cu.uci.coj.model.Mail;
import cu.uci.coj.utils.paging.IPaginatedList;
import cu.uci.coj.utils.paging.PagingOptions;
import cu.uci.coj.validator.sendMailValidator;

@Controller
public class MailController extends BaseController {

    @Resource
    private MailDAO mailDAO;
    @Resource
    private UserDAO userDAO;
    @Resource
    private sendMailValidator sendmailValidator;
    @Resource
    private MailNotificationService MailNotificationService;

    @Autowired
    private MessageSource messageSource;

    private String sendMail(Mail mail) {
        int size = mail.getContent().getBytes().length + mail.getTitle().getBytes().length;

        // metemos el arreglo de remitentes en un set para eliminar los
        // duplicados.
        Set<String> toSet = new HashSet<String>(Arrays.asList(mail.getUsernameTo().split(";")));

        if (mailDAO.bool("check.quota", size, mail.getId_from())) {
            for (String to : toSet) {
                String string = to.replaceAll(" ", "");

                if (mailDAO.bool("check.quota", size, to)) {
                    int idmail = mailDAO.insertInternalEmail(mail, string, size);
                    mail.setIdmail(idmail);
                    try {
                        MailNotificationService.sendNewPrivateMessageNotification(mail, string);
                    } catch (Exception e) {
                        //Si con alguno de los usuarios da error, captar aqui
                        return "error" + string;
                    }

                } else
                    return to;
            }
            return null;
        }
        return "";
    }

    public Mail getMailForSending(int idmail, Principal principal, @RequestParam(required = false, value = "all") String all, @RequestParam(required = false, value = "fwd") String fwd) {

        Mail mail = mailDAO.object("get.mail.for.sending", Mail.class, idmail, getUsername(principal));


        try {
            mail.setContent("<br/><br/>----- Original Message ----- <br/> From: " + mail.getUsernameTo() + "<br/>To: " + mail.getTo() + "<br/>Received: "
                    + DateFormat.getInstance().format(mail.getDate()) + "<br/>Subject: " + mail.getTitle()/*new String(mail.getTitle().getBytes("8859_1"), "UTF8")*/ + "<br/><br/>" +
                    mail.getContent()); /*new String(mail.getContent().getBytes("8859_1"), "UTF8"))*/
            String content = mail.getTitle(); /*new String(mail.getTitle().getBytes("8859_1"), "UTF8");*/
            if (!content.startsWith("Re:")) {
                content = "Re: " + content;
            }
            mail.setTitle(content);
        } catch (Exception e) {
        }

        if (fwd != null && fwd.equals("true")) {
            mail.setUsernameTo("");
            mail.setTitle(mail.getTitle().replaceFirst("Re", "Fwd"));
        }
        return mail;
    }

    @RequestMapping(value = "/mail/composemail.xhtml", method = RequestMethod.GET)
    public String composeMail(Model model, HttpServletRequest request, Principal principal, @RequestParam(required = false, value = "all") String all,
                              @RequestParam(required = false, value = "fwd") String fwd,
                              @RequestParam(required = false, value = "isend") Integer isend,
                              @RequestParam(required = false, value = "reply") Integer reply,
                              @RequestParam(required = false, value = "draft") Integer draft,
                              @RequestParam(required = false, value = "usernameto") String usernameto,
                              @RequestParam(required = false, value = "title") String title,
                              @RequestParam(required = false, value = "content") String content) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }

        Mail mail = new Mail();
        mail.setUsernameTo(usernameto);
        mail.setTitle(title);
        mail.setContent(content);
        if (reply != null) {
            mail = getMailForSending(reply, principal, all, fwd);
            //mail = getUserMail(reply, getUsername(principal));
            mail.setRedirectInbox(true);
        } else if (isend != null) {
            mail = getSendMailForSending(isend, principal, all, fwd);
            mail.setRedirectInbox(false);
        } else if (draft != null) {
            mail = getDraftMail(draft, getUsername(principal));
        }
        mail.setId_from(getUsername(principal));
        model.addAttribute(mail);
        return "/mail/composemail";
    }

    private Mail getSendMailForSending(int idmail, Principal principal, @RequestParam(required = false, value = "all") String all, @RequestParam(required = false, value = "fwd") String fwd) {

        Mail mail = mailDAO.object("mail.for.sending", Mail.class, idmail, getUsername(principal));
        try {
            mail.setContent("<br/><br/>----- Original Message ----- <br/> From: " + getUsername(principal) + "<br/>To: " + mail.getUsernameTo() + "<br/>Received: "
                    + DateFormat.getInstance().format(mail.getDate()) + "<br/>Subject: " + new String(mail.getTitle().getBytes("8859_1"), "UTF8") + "<br/><br/>"
                    + new String(mail.getContent().getBytes("8859_1"), "UTF8"));
            mail.setTitle("Re: " + new String(mail.getTitle().getBytes("8859_1"), "UTF8"));
        } catch (Exception e) {
        }
        if (fwd != null && fwd.equals("true")) {
            mail.setUsernameTo("");
            mail.setTitle(mail.getTitle().replaceFirst("Re", "Fwd"));
        }

        return mail;
    }

    @RequestMapping(value = "/mail/composemail.xhtml", method = RequestMethod.POST)
    public String composeMail(Model model, Principal principal, Mail mail, BindingResult errors, RedirectAttributes redirectAttributes, Locale locale) {

        mail.setUsernameTo(mail.getUsernameTo().replace(" ", ""));
        sendmailValidator.validate(mail, errors);

        if (errors.hasErrors()) {
            model.addAttribute(mail);
            return "/mail/composemail";
        }

        mail.setId_from(getUsername(principal));
        // result = null se mando el mensaje, "" no habia espacio en el
        // inbox del remitente, o si no hay espacio en el inbox de algun
        // receptor, se devuelve el nombre de ese receptor
        String result = sendMail(mail);

        model.addAttribute("receiverInboxOverflow", null);
        model.addAttribute("inboxOverflow", false);

        if (result != null) {

            if (result.contains("error")) {
                //obtener el usuario que presenta algun error
                /*errors.rejectValue("usernameTo", "errormsg.51" + result.replace("error", ""));*/
                /*redirectAttributes.addFlashAttribute("usernameerror", messageSource.getMessage("errormsg.51", null, locale) + " " + result.replace("error", ""));*/
                /*redirectAttributes.addFlashAttribute(mail);*/
                model.addAttribute("receiverInboxOverflow", result.replace("error", ""));
                model.addAttribute(mail);
                redirectAttributes.addFlashAttribute("usernameerror", messageSource.getMessage("errormsg.59", null, locale) + " " + result.replace("error", " "));
                return "redirect:/mail/composemail.xhtml";
            }

            if (result == "")
                model.addAttribute("inboxOverflow", true);
            else
                model.addAttribute("receiverInboxOverflow", result);
            return "/mail/composemail";
        }

        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullSendMail());

        if (mail.isRedirectInbox()) {
            return "redirect:/mail/inbox.xhtml";
        }
        return "redirect:/mail/outbox.xhtml";
    }

    @RequestMapping(value = "/mail/outbox.xhtml", method = RequestMethod.GET)
    public String outbox(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }
        model.addAttribute("mail", mailDAO.getMailValues(getUsername(principal)));
        return "/mail/outbox";
    }

    @RequestMapping(value = "/tables/outbox.xhtml", method = RequestMethod.GET)
    public String tablesOutbox(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        model.addAttribute("mails", mailDAO.paginated("user.outbox", Mail.class, 30, options, getUsername(principal)));
        return "/tables/outbox";
    }

    @RequestMapping(value = "/mail/markunread.xhtml", method = RequestMethod.GET)
    public String markunread(Principal principal, @RequestParam("idmail") Integer idmail) {
        if (mailDAO.bool("mail.belong.to", idmail, getUsername(principal))) {
            mailDAO.dml("change.read.state", false, idmail);
            return "redirect:/mail/inbox.xhtml";
        }
        return "/error/error";
    }

    @RequestMapping(value = "/mail/inbox.xhtml", method = RequestMethod.GET)
    public String inbox(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }
        model.addAttribute("mail", mailDAO.getMailValues(getUsername(principal)));
        return "/mail/inbox";
    }

    @RequestMapping(value = "/tables/inbox.xhtml", method = RequestMethod.GET)
    public String tablesInbox(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        IPaginatedList<Mail> mails = mailDAO.paginated("user.inbox", Mail.class, 30, options, getUsername(principal));
        model.addAttribute("mails", mails);
        return "/tables/inbox";
    }

    @RequestMapping(value = "/mail/deleteallmail.xhtml", method = RequestMethod.GET)
    public String deleteAllMail(Principal principal, @RequestParam("delete") Integer delete, RedirectAttributes redirectAttributes) {

        if (delete == 1) {
            if (mailDAO.bool("has.mail.in", getUsername(principal))) {
                mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
                mailDAO.dml("delete.user.mail.idto", getUsername(principal));
            }
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/inbox.xhtml";
        } else if (delete == 2) {
            if (mailDAO.bool("has.mail.out", getUsername(principal))) {
                mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
                mailDAO.dml("delete.send.mail.username", getUsername(principal));
            }
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/outbox.xhtml";
        } else if (delete == 3) {
            if (mailDAO.bool("has.draft.out", getUsername(principal))) {
                mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
                mailDAO.dml("delete.draft.mail.username", getUsername(principal));
            }
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/draft.xhtml";
        }
        return "/error/error";
    }

    @RequestMapping(value = "/mail/deletemail.xhtml", method = RequestMethod.GET)
    public String deletemail(Principal principal, @RequestParam(required = false, defaultValue = "0", value = "idmail") Integer idmail,
                             @RequestParam(required = false, defaultValue = "0", value = "send") Integer send, @RequestParam(required = false, defaultValue = "0", value = "draft") Integer draft, RedirectAttributes redirectAttributes) {

        if (idmail != 0) {
            mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
            mailDAO.dml("delete.user.mail.idmail", idmail, getUsername(principal));
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/inbox.xhtml";
        } else if (send != 0) {
            mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
            mailDAO.dml("delete.send.mail.idmail", send, getUsername(principal));
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/outbox.xhtml";
        } else if (draft != 0) {
            mailDAO.dml("update.quote", getUsername(principal), getUsername(principal), getUsername(principal), getUsername(principal), userDAO.integer("select.uid.by.username", getUsername(principal)));
            mailDAO.dml("delete.draft.mail.iddraft", draft, getUsername(principal));
            redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
            return "redirect:/mail/draft.xhtml";
        }
        return "/error/error";
    }

    private Mail getUserMail(int idmail, String username) {
        Mail mail = mailDAO.object("get.user.mail", Mail.class, idmail, username);
        mail.setInmail(true);
        return mail;
    }

    private Mail getSendMail(int idmail, String username) {
        Mail mail = mailDAO.object("get.send.mail", Mail.class, idmail, username);
        mail.setSend(true);
        return mail;
    }

    private Mail getDraftMail(int idmail, String username) {
        Mail mail = mailDAO.object("get.draft.mail", Mail.class, idmail, username);
        return mail;
    }

    @RequestMapping(value = "/mail/mailview.xhtml", method = RequestMethod.GET)
    public String mailview(HttpServletRequest request, Principal principal, Model model, @RequestParam(required = false, defaultValue = "0", value = "idmail") Integer idmail,
                           @RequestParam(required = false, defaultValue = "0", value = "send") Integer send, @RequestParam(required = false, defaultValue = "0", value = "draft") Integer draft) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }
        Mail mail = null;
        boolean available = false;
        if (idmail != 0) {
            mail = getUserMail(idmail, getUsername(principal));
            if (!mail.isIsread()) {
                mailDAO.dml("change.read.state", true, idmail);
            }
            available = true;
        } else if (send != 0) {
            mail = getSendMail(send, getUsername(principal));
            available = true;
        } else if (draft != 0) {
            mail = getDraftMail(draft, getUsername(principal));
            available = true;
        }
        model.addAttribute("usermail", mail);
        model.addAttribute("available", available);
        return "/mail/mailview";
    }

    @RequestMapping(value = "/mail/savedraft.xhtml", method = RequestMethod.POST)
    public String saveDrafts(Model model, Principal principal, Mail mail, Locale locale) {
        JSONObject msg = new JSONObject();
        int cantDraftsUser = 0;
        String message = "";
        String username = getUsername(principal);
		/*WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());*/
        if (mail.getContent() == null || mail.getContent().isEmpty()) {
			/*message = AppContext.getApplicationContext().getMessage("errormsg.49", null, Locale.getDefault());*/
            message = messageSource.getMessage("errormsg.49", null, locale);
        } else {
            int size = mail.getContent().getBytes().length + mail.getTitle().getBytes().length;
            mailDAO.dml("insert.draft", principal.getName(), mail.getContent(), mail.getTitle(), size);
//            mailDAO.dml("insert.draft", principal.getName(), mail.getUsernameTo(), mail.getContent(), mail.getTitle(), size);
            mailDAO.dml("update.quote", principal.getName(), principal.getName(), principal.getName(), principal.getName(), userDAO.idByUsername(principal.getName()));

            cantDraftsUser = mailDAO.integer("count.user.draft", username);
            message = messageSource.getMessage("errormsg.48", null, locale);

        }
        try {
            msg.accumulate("cantDraftsUser", cantDraftsUser);
            msg.accumulate("message", message);
        } catch (JSONException ex) {
        }
        model.addAttribute("message", msg);
        return "/mail/savedraft";
    }

    @RequestMapping(value = "/mail/draft.xhtml", method = RequestMethod.GET)
    public String draft(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }
        model.addAttribute("mail", mailDAO.getMailValues(getUsername(principal)));
        model.addAttribute("mails", mailDAO.paginated("user.draft", Mail.class, 20, options, getUsername(principal)));
        return "/mail/draft";
    }

    @RequestMapping(value = "/tables/draft.xhtml", method = RequestMethod.GET)
    public String draftTable(HttpServletRequest request, Principal principal, Model model, PagingOptions options) {
        if (!mailDAO.isEnabled() && !hasAnyPrivileges(request)) {
            return "redirect:/index.xhtml";
        }
        model.addAttribute("mails", mailDAO.paginated("user.draft", Mail.class, 20, options, getUsername(principal)));
        return "/tables/draft";
    }
}
