package cu.uci.coj.controller.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import cu.uci.coj.utils.Notification;

import cu.uci.coj.controller.BaseController;
import cu.uci.coj.dao.ContestDAO;
import cu.uci.coj.dao.InstitutionDAO;
import cu.uci.coj.dao.UserDAO;
import cu.uci.coj.dao.UtilDAO;
import cu.uci.coj.model.Authority;
import cu.uci.coj.model.Country;
import cu.uci.coj.model.Group;
import cu.uci.coj.model.Institution;
import cu.uci.coj.model.Locale;
import cu.uci.coj.model.Roles;
import cu.uci.coj.model.Team;
import cu.uci.coj.model.User;
import cu.uci.coj.utils.paging.IPaginatedList;
import cu.uci.coj.utils.paging.PagingOptions;
import cu.uci.coj.validator.userValidator;
import cu.uci.coj.utils.Notification;

@Controller("userAdminController")
@RequestMapping(value = "/admin")
public class UserController extends BaseController {

	@Resource
	private UserDAO userDAO;
	@Resource
	private UtilDAO utilDAO;
	@Resource
	private ContestDAO contestDAO;
	@Resource
	private InstitutionDAO institutionDAO;
	@Resource
	private userValidator validator;

	@RequestMapping(produces = "application/json", value = "/wakeup.json", method = RequestMethod.GET, headers = { "Accept=application/json" })
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void wakeup(Model model, @RequestParam(value = "status") String status) {
	}

	@RequestMapping(value = "/manageusers.xhtml", method = RequestMethod.GET)
	public String listUsers(Model model, PagingOptions options,
			@RequestParam(required = false, value = "pattern") String pattern) {
		model.addAttribute("pattern", pattern);
		return "/admin/manageusers";
	}

	@RequestMapping(produces = "application/json", value = "/banuser.json", method = RequestMethod.GET, headers = { "Accept=application/json" })
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void banUser(Model model, @RequestParam(value = "uid") int uid,
			@RequestParam(value = "description") String description) {
		userDAO.banUser(uid, description);
	}

	@RequestMapping(produces = "application/json", value = "/unbanuser.json", method = RequestMethod.GET, headers = { "Accept=application/json" })
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void unbanUser(Model model, @RequestParam(value = "uid") int uid) {
		userDAO.unbanUser(uid);
	}

	@RequestMapping(value = "/tables/manageusers.xhtml", method = RequestMethod.GET)
	public String tableListUsers(Model model, PagingOptions options,
			@RequestParam(required = false, value = "pattern") String pattern) {
		IPaginatedList<User> users = userDAO.loadUsersAdmin(pattern, options);
		model.addAttribute("users", users);
		return "/admin/tables/manageusers";
	}

	@RequestMapping(value = "/manageuser.xhtml", method = RequestMethod.GET)
	public String manageUsers(Model model,
			@RequestParam("username") String username) {
		User user;
		if (userDAO.isUser(username)) {
			user = userDAO.loadAllUserData(username);
			// Pasamos ROLE_USER por defecto para evitar que se pueda desmarcar.
			// Todos los usuarios deben tener este rol.
			List<String> authorities = new ArrayList<String>();
			authorities.add(Roles.ROLE_USER);
			authorities.addAll(userDAO.getUserAuthorities(user.getUsername()));
			user.setAuthorities(authorities);
		} else {
			user = userDAO.loadAllTeamData(username);
		}
		model.addAttribute("countries",
				userDAO.objects("enabled.countries", Country.class));
		model.addAttribute("planguages",
				utilDAO.getEnabledProgramingLanguages());
		model.addAttribute("locales",
				utilDAO.objects("enabled.locale", Locale.class));
		if (user.getCountry_id() != 0) {
			List<Institution> institutions = institutionDAO
					.getEnabledInstitutionsByCountry_id(user.getCountry_id());
			institutions
					.add(0, new Institution(-1, "NONE", "NONE INSTITUTION"));
			model.addAttribute("institutions", institutions);
		}
		model.addAttribute("authorities",
				utilDAO.objects("load.authorities", Authority.class));
		model.addAttribute(user);
		return "/admin/manageuser";
	}

	@RequestMapping(value = "/manageuser.xhtml", method = RequestMethod.POST)
	public String manageUsers(Model model, User user, BindingResult result, RedirectAttributes redirectAttributes) {
		user.setUid(userDAO.integer("select.uid.by.username",
				user.getUsername()));
		user.setTeam(userDAO.bool("is.team", user.getUsername()));
		validator.validateManageAdmin(user, result);
		if (result.hasErrors()) {
			model.addAttribute("countries",
					userDAO.objects("enabled.countries", Country.class));
			model.addAttribute("planguages",
					utilDAO.getEnabledProgramingLanguages());
			model.addAttribute("locales",
					utilDAO.objects("enabled.locale", Locale.class));
			if (user.getCountry_id() != 0) {
				List<Institution> institutions = institutionDAO
						.getEnabledInstitutionsByCountry_id(user
								.getCountry_id());
				institutions.add(0, new Institution(-1, "NONE",
						"NONE INSTITUTION"));
				model.addAttribute("institutions", institutions);
			}
			model.addAttribute("authorities",
					utilDAO.objects("load.authorities", Authority.class));
			model.addAttribute(user);
			return "/admin/manageuser";
		}
		if (user.getPassword() != null && user.getPassword().length() > 0) {
			Md5PasswordEncoder md5 = new Md5PasswordEncoder();
			user.setPassword(md5.encodePassword(user.getPassword(),
					"ABC123XYZ789"));
		}
		userDAO.updateUserByAdmin(user);
                redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullUpdate());

		if (!user.isTeam()) {
			userDAO.clearUserAuthorities(user.getUsername());
			userDAO.grantUserAuthority(user);
		}
		if (user.isTeam()) {
			return "redirect:/admin/manageteams.xhtml";
		}
		return "redirect:/admin/manageusers.xhtml";
	}

	@RequestMapping(value = "/manageteams.xhtml", method = RequestMethod.GET)
	public String listTeams(Model model, PagingOptions options,
			@RequestParam(required = false, value = "pattern") String pattern) {
		model.addAttribute("pattern", pattern);
		return "/admin/manageteams";
	}

	@RequestMapping(value = "/tables/manageteams.xhtml", method = RequestMethod.GET)
	public String tablesListTeams(Model model, PagingOptions options,
			@RequestParam(required = false, value = "pattern") String pattern) {
		IPaginatedList<User> users = userDAO.loadTeamsAdmin(pattern, options);
		model.addAttribute("users", users);
		model.addAttribute("found", users.getFullListSize());
		return "/admin/tables/manageteams";
	}

	@RequestMapping(value = "/createteams.xhtml", method = RequestMethod.GET)
	public String createTeams(Model model) {
		model.addAttribute("contests", contestDAO.getComingAndRunningContests());
		model.addAttribute("countries",
				userDAO.objects("enabled.countries", Country.class));
		model.addAttribute("groups", utilDAO.objects("get.groups", Group.class));
		model.addAttribute("locales",
				utilDAO.objects("enabled.locale", Locale.class));
		Team team = new Team();
			List<Institution> institutions = institutionDAO
				.getEnabledInstitutionsByCountry_id(team.getCountry());
		//institutions.add(0, new Institution(-1, "NONE", "NONE INSTITUTION"));
		model.addAttribute("institutions", institutions);
		model.addAttribute(team);
		return "/admin/createteams";
	}

	@RequestMapping(value = "/createteams.xhtml", method = RequestMethod.POST)
	public String createTeams(Model model, Team team, BindingResult result, RedirectAttributes redirectAttributes) {
		validator.validateTeam(team, result);
		if (result.hasErrors()) {
			model.addAttribute("contests",
					contestDAO.getComingAndRunningContests());
			model.addAttribute("countries",
					userDAO.objects("enabled.countries", Country.class));
			model.addAttribute("groups",
					utilDAO.objects("get.groups", Group.class));
			model.addAttribute("locales",
					utilDAO.objects("enabled.locale", Locale.class));
			List<Institution> institutions = institutionDAO
					.getEnabledInstitutionsByCountry_id(team.getCountry());
			//institutions.add(0, new Institution(-1, "NONE", "NONE INSTITUTION"));
			model.addAttribute("institutions", institutions);
			model.addAttribute(team);
			return "/admin/createteams";
		}
		userDAO.createTeams(team);
                redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullCreate());
		return "redirect:/admin/manageteams.xhtml";
	}
}
