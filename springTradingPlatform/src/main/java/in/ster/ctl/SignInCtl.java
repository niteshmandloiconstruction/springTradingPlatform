package in.ster.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ster.pojo.User;
import in.ster.service.UserService;
import in.ster.service.UserServiceImpl;

@Controller
public class SignInCtl {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/SignIn")
	public ModelAndView signIn(@ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();
		
		boolean result = this.userService.checkUser(user);
		if(result) {
			mv.setViewName("LoginSuccessfully");
		}
		else {
			mv.setViewName("Error");
		}
	
		return mv;
	
	}
	
}

