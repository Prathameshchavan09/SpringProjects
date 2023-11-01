package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;


@Controller
public class registerController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String home() {
		
		return "register";
	}
	
	public String DataPassControToView(Model model) {
		
		
		model.addAttribute("Register" , "Registration Page");
		model.addAttribute("Description" , "Developed using Spring MVC");
		
		return null;
		
	}

	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	private String handler(@ModelAttribute("user") User user,Model model) {
		
		
		
		System.out.println(user);
		 this.userService.createUser(user);
		 
		 
		 return "sucess";
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
