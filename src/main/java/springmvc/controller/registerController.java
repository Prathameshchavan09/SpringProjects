package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class registerController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/home")
	public String home() {
		
		return "register";
	}
	

	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	private String handler(@ModelAttribute("user") User user,Model model) {
		
		System.out.println(user);
		return this.userDao.createUser();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
