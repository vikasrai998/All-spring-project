package org.jsp.controller;

import java.awt.Point;

import javax.servlet.http.HttpServletRequest;

import org.jsp.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = { "user", "person" })
public class HomeController {
	@RequestMapping("/load")
	public ModelAndView load(ModelAndView view) {
		view.setViewName("register");
		view.addObject("user", new User());
		return view;
	}

	@RequestMapping("/hii")
	@ResponseBody
	public String hello() {
		return "hello from HomeController";
	}

	@RequestMapping("/home")
	public ModelAndView home(ModelAndView view) {
		view.setViewName("home");
		view.addObject("user", "ABC");
		return view;
	}

	@RequestMapping(value = "/verify")
	public ModelAndView verifySession(ModelAndView view) {
		view.addObject("user", "ABC");
		view.addObject("person", "XYZ");
		view.addObject("me", "hello");
		view.setViewName("display");
		return view;
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public void register(@ModelAttribute User user) {
		System.out.println("name:" + user.getName());
		System.out.println("Age:" + user.getAge());
		System.out.println("Phone:" + user.getPhone());
		System.out.println("password:" + user.getPassword());
	}
}
