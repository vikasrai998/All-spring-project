                                                     package org.jsp.usermvcapp.controller;

import javax.servlet.http.HttpSession;

import org.jsp.usermvcapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
	@Autowired
	UserService service;

	@RequestMapping("/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("message", "Logged Out");
		return "login";
	}

	@RequestMapping("/delete")
	public ModelAndView deleteuser(@RequestParam int id, ModelAndView view, HttpSession session) {
		service.deleteUser(id);
		session.invalidate();
		view.setViewName("print");
		view.addObject("message", "user deleted");
		return view;
	}
}
