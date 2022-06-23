package in.ster.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ster.pojo.User;
import in.ster.service.UserService;
import in.ster.service.UserServiceImpl;

@Controller
public class ResistrationCtl {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/Registration")
	public ModelAndView forRegistration(@ModelAttribute User user, Model model) {
		ModelAndView mv = new ModelAndView();

		int result = this.userService.createUser(user);
		if (result > 0) {
			mv.setViewName("RegisteredSuccessfully");
		} else {
			mv.setViewName("Error");
		}

		return mv;
	}

}
