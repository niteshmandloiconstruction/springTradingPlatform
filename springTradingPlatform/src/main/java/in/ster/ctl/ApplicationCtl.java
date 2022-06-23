package in.ster.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationCtl {

	@RequestMapping(value= {"/","Index"})
	public String index() {

		return "Index";
	}
	
	@RequestMapping("/Register")
	public String register() {

		return "Register";
	}
	
	@RequestMapping("/Login")
	public String login() {

		return "Login";
	}

}
