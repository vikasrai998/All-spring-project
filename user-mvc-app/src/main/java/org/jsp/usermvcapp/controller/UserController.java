package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dto.User;
import org.jsp.usermvcapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = { "u" })
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("/load")
	public ModelAndView load(ModelAndView view, @RequestParam int choice) {
		if (choice == 1)
			view.setViewName("register");
		if (choice == 2)
			view.setViewName("edit");
		view.addObject("user", new User());
		return view;
	}

	@RequestMapping("/reg")
	public ModelAndView saveUser(@ModelAttribute User user, ModelAndView view) {
		user = service.saveUser(user);
		view.setViewName("print");
		view.addObject("message", "User saved with ID:" + user.getId());
		return view;
	}

	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public String login(@RequestParam long phone, @RequestParam String password, Model model) {
		User user = service.verifyUser(phone, password);
		if (user != null) {
			model.addAttribute("u", user);
			return "home";
		} else {
			model.addAttribute("message", "Invlaid Phone Number or Password");
			return "login";
		}
	}

	@RequestMapping("/edit")
	public ModelAndView updateUser(@ModelAttribute User user, ModelAndView view) {
		user = service.updateUser(user);
		view.addObject("user", user);
		view.setViewName("print");
		view.addObject("message", "user updated succesfully");
		return view;
	}

	
}
