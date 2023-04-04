package org.jsp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.jsp");
		modelAndView.addObject("user", new ArrayList<>(Arrays.asList("Pushpa", "Rocky", "Bahubali")));
		return modelAndView;
	}

	@RequestMapping("/sum")
	public ModelAndView findSum(@RequestParam(name = "n1") int a, @RequestParam(name = "n2") int b, ModelAndView view) {
		String result = "the sum is " + (a + b);
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}

	@RequestMapping("/diff")
	public ModelAndView findDiff(@RequestParam int n1, @RequestParam int n2, ModelAndView view) {
		String result = "The difference is " + (n1 - n2);
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}

	@RequestMapping("/display")
	public ModelAndView displayUsers(ModelAndView view) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "ABC", 888));
		users.add(new User(2, "XYZ", 999));
		users.add(new User(3, "PQR", 777));
		view.setViewName("viewUsers.jsp");
		view.addObject("us", users);
		return view;
		
	}

}
