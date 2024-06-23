package cu.uci.coj.controller.admin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import cu.uci.coj.utils.Notification;

import cu.uci.coj.controller.BaseController;
import cu.uci.coj.dao.ProblemDAO;
import cu.uci.coj.model.Problem;
import cu.uci.coj.model.ProblemClassification;
import cu.uci.coj.utils.paging.IPaginatedList;
import cu.uci.coj.utils.paging.PagingOptions;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/admin")
public class ClassificationController extends BaseController {

    @Resource
    private ProblemDAO problemDAO;

    /*RF34 Listar etiquetas para clasificar problema*/
    @RequestMapping(value = "/manageclassifications.xhtml", method = RequestMethod.GET)
    public String allClassifications(Model model, @RequestParam(required = false, value = "username") String filter_user, @RequestParam(required = false, value = "pid") Integer pid,
                                     @RequestParam(required = false, value = "status") String status, @RequestParam(required = false, value = "planguage") String language, PagingOptions options) {
        return "/admin/manageclassifications";
    }

    @RequestMapping(value = "/tables/manageclassifications.xhtml", method = RequestMethod.GET)
    public String tablesAllClassifications(Model model, @RequestParam(required = false, value = "username") String filter_user, @RequestParam(required = false, value = "pid") Integer pid,
                                           @RequestParam(required = false, value = "status") String status, @RequestParam(required = false, value = "planguage") String language, PagingOptions options) {
        IPaginatedList<ProblemClassification> classifications = problemDAO.getClassifications(options);

        model.addAttribute("classifications", classifications);

        return "/admin/tables/manageclassifications";
    }

    /* RF35 Adicionar etiquetas para clasificar problema*/
    @RequestMapping(value = "/addclassifications.xhtml", method = RequestMethod.POST)
    public String addClassifications(Model model, @RequestParam(required = false, value = "username") String filter_user, @RequestParam(required = false, value = "pid") Integer pid,
                                     @RequestParam(required = false, value = "status") String status, @RequestParam(required = false, value = "planguage") String language, PagingOptions options,
                                     @RequestParam(required = true, value = "name") String name, RedirectAttributes redirectAttributes) {
        String newname = name.replace(" ", "");

        if (newname.length() == 0) {
            redirectAttributes.addFlashAttribute("message", Notification.getNotSuccesfullCreate());
            redirectAttributes.addFlashAttribute("errorcreate", true);
            return "redirect:/admin/manageclassifications.xhtml";
        }

        problemDAO.insertClassification(name);
        IPaginatedList<ProblemClassification> classifications = problemDAO.getClassifications(options);

        model.addAttribute("classifications", classifications);

        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullCreate());
        return "redirect:/admin/manageclassifications.xhtml";
    }

    /*RF36 Editar etiqueta para clasificar problema*/
    @RequestMapping(value = "/updateclassifications.xhtml", method = RequestMethod.GET)
    public String updateClassifications(Model model, @RequestParam(required = true, value = "classid") Integer classid, @RequestParam(required = true, value = "name") String name,
                                        RedirectAttributes redirectAttributes) {

        String newname = name.replace(" ", "");

        if (newname.length() == 0) {
            redirectAttributes.addFlashAttribute("message", Notification.getNotSuccesfullUpdate());
            redirectAttributes.addFlashAttribute("errorcreate", true);
            return "redirect:/admin/manageclassifications.xhtml";
        }

        problemDAO.updateClassification(classid, name);

        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullUpdate());
        return "redirect:/admin/manageclassifications.xhtml";
    }

    /*RF37 Eliminar etiqueta para clasificar problema*/
    @RequestMapping(value = "/deleteclassifications.xhtml", method = RequestMethod.GET)
    public String deleteClassifications(Model model, @RequestParam(required = true, value = "classid") Integer classid, RedirectAttributes redirectAttributes) {
        problemDAO.deleteClassification(classid);

        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullDelete());
        return "redirect:/admin/manageclassifications.xhtml";
    }

    @RequestMapping(value = "/manageproblemclassification.xhtml", method = RequestMethod.GET)
    public String manageProblemClassification(Model model, Locale locale, @RequestParam(required = false, value = "add") String add, @RequestParam(required = false, value = "nc") String nc,
                                              @RequestParam(required = false, value = "rmb") String rmb, @RequestParam(required = false, value = "pid") Integer pid, @RequestParam(required = false, value = "cid") Integer cid,
                                              PagingOptions options) {
        if (add != null) {
            problemDAO.insertProblemClassification(pid, cid);
        } else if (rmb != null) {
            problemDAO.deleteProblemClassification(pid, cid);
        } else {
            if (nc != null) {
                try {
                    problemDAO.insertClassification(nc);
                } catch (DataIntegrityViolationException error) {
                    Map<String, String> errors = new HashMap<String, String>();
                    errors.put("alreadyExistsError", "errormsg.problemclass.alreadyexists");
                    model.addAttribute("errors", errors);
                }
            }

            List<ProblemClassification> classifications = problemDAO.getClassifications();
            if (pid != null) {
                List<ProblemClassification> problemClassifications = problemDAO.getProblemClassifications(pid);
                for (Iterator<ProblemClassification> it = problemClassifications.iterator(); it.hasNext(); ) {
                    ProblemClassification problemClassification = it.next();
                    for (ProblemClassification classification : classifications) {
                        if (classification.getIdClassification() == problemClassification.getIdClassification()) {
                            classifications.remove(classification);
                            break;
                        }
                    }
                }
                model.addAttribute("problemClassifications", problemClassifications);
            }
            model.addAttribute("classifications", classifications);
        }

        model.addAttribute("problems", problemDAO.findAllProblemsWithoutClassification(locale.getLanguage(), options));
        return "/admin/manageproblemclassification";
    }

    @ExceptionHandler(TypeMismatchException.class)
    public RedirectView handleIOException(TypeMismatchException e, HttpServletRequest request) {
        RedirectView redirectView = new RedirectView("/admin/errorRedirectPage.xhtml");
        redirectView.addStaticAttribute("errorMessage", e.getMessage());
        return redirectView;
    }

    @RequestMapping(value = "/errorRedirectPage.xhtml", method = RequestMethod.GET)
    public String errorRedirectPage(HttpServletRequest request, Model model) {
        model.addAttribute("notint", true);
        return "/admin/manageproblemclassification";
    }

    @RequestMapping(value = "/classify.xhtml", method = RequestMethod.GET)
    public String clasificateG(Model model) {
        return "/admin/manageproblemclassification";
    }

    @RequestMapping(value = "/classify.xhtml", params = {"submit"}, method = RequestMethod.GET)
    public String clasificateGET(Model model) {
        return "/admin/manageproblemclassification";
    }

    @RequestMapping(value = "/classify.xhtml", method = RequestMethod.POST)
    public String clasificate(Model model, Locale locale, PagingOptions options, /*@RequestParam(required = false, value =*/ @ModelAttribute("pid") Integer pid) {

        boolean eid = false;

        Problem problem;

        try {
            problemDAO.getProblemByPid(locale.getLanguage(), pid);
        } catch (Exception e) {
            model.addAttribute("problems", problemDAO.findAllProblemsWithoutClassification(locale.getLanguage(), options));
            model.addAttribute("notid", !eid);
            return "/admin/manageproblemclassification";
        }

        List<ProblemClassification> classifications = problemDAO.getClassifications();

        List<ProblemClassification> problemClassifications = problemDAO.getProblemClassifications(pid);

        for (Iterator<ProblemClassification> it = problemClassifications.iterator(); it.hasNext(); ) {
            ProblemClassification problemClassification = it.next();
            for (ProblemClassification classification : classifications) {
                if (classification.getIdClassification() == problemClassification.getIdClassification()) {
                    classifications.remove(classification);
                    break;
                }
            }
        }
        model.addAttribute("problemClassifications", problemClassifications);
        model.addAttribute("classifications", classifications);
        model.addAttribute("problems", problemDAO.findAllProblemsWithoutClassification(locale.getLanguage(), options));
        model.addAttribute("notid", eid);
        return "/admin/manageproblemclassification";
    }

    @RequestMapping(value = "/tables/manageproblemclassification.xhtml", method = RequestMethod.GET)
    public String tablesManageProblemClassification(Model model, Locale locale, @RequestParam(required = false, value = "add") String add, @RequestParam(required = false, value = "nc") String nc,
                                                    @RequestParam(required = false, value = "rmb") String rmb, @RequestParam(required = false, value = "pid") Integer pid, @RequestParam(required = false, value = "cid") Integer cid,
                                                    PagingOptions options) {
        List<ProblemClassification> classifications = problemDAO.getClassifications();
        if (pid != null) {
            List<ProblemClassification> problemClassifications = problemDAO.getProblemClassifications(pid);
            for (Iterator<ProblemClassification> it = problemClassifications.iterator(); it.hasNext(); ) {
                ProblemClassification problemClassification = it.next();
                for (ProblemClassification classification : classifications) {
                    if (classification.getIdClassification() == problemClassification.getIdClassification()) {
                        classifications.remove(classification);
                        break;
                    }
                }
            }
            model.addAttribute("problemClassifications", problemClassifications);
        }
        model.addAttribute("classifications", classifications);

        IPaginatedList<Problem> p = problemDAO.findAllProblemsWithoutClassification(locale.getLanguage(), options);

        model.addAttribute("problems", p);
        return "/admin/tables/manageproblemclassification";
    }

    @RequestMapping(value = "/manageproblemclassification.xhtml", method = RequestMethod.POST)
    public String manageProblemClassification1(Model model, @RequestParam(required = false, value = "add") String add, @RequestParam(required = false, value = "nc") String nc,
                                               @RequestParam(required = false, value = "rmb") String rmb, @RequestParam(required = false, value = "pid") Integer pid, @RequestParam(required = false, value = "cid") Integer cid,
                                               @RequestParam(required = false, value = "cpx") Integer complexity) {
        if (add != null) {
            problemDAO.insertProblemClassification(pid, cid, complexity);
        } else if (rmb != null) {
            problemDAO.deleteProblemClassification(pid, cid);
        } else {
            if (nc != null) {
                try {
                    problemDAO.insertClassification(nc);
                } catch (DataIntegrityViolationException error) {
                    Map<String, String> errors = new HashMap<String, String>();
                    errors.put("alreadyExistsError", "errormsg.problemclass.alreadyexists");
                    model.addAttribute("errors", errors);
                }
            }

            //Chequear si existe id del problema
            int count = problemDAO.integer("select.count.problem.classifications", pid);

            if (count <= 0){
                //No existe el problema
                model.addAttribute("notid", true);
                return "/admin/manageproblemclassification";
            }

            List<ProblemClassification> classifications = problemDAO.getClassifications();
            if (pid != null) {
                List<ProblemClassification> problemClassifications = problemDAO.getProblemClassifications(pid);
                for (Iterator<ProblemClassification> it = problemClassifications.iterator(); it.hasNext(); ) {
                    ProblemClassification problemClassification = it.next();
                    for (Iterator<ProblemClassification> it1 = classifications.iterator(); it1.hasNext(); ) {
                        ProblemClassification classification = it1.next();
                        if (classification.getIdClassification() == problemClassification.getIdClassification()) {
                            classifications.remove(classification);
                            break;
                        }
                    }
                }
                model.addAttribute("problemClassifications", problemClassifications);
            }
            model.addAttribute("classifications", classifications);
        }
        return "/admin/manageproblemclassification";
    }

}
