package org.jsp.userapp.controller;

import org.jsp.userapp.UserConfig;
import org.jsp.userapp.dto.User;
import org.jsp.userapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("ABc");
		user.setPassword("a1234");
		user.setPhone(855687);
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		UserService service = context.getBean(UserService.class);
		service.saveUser(user);
	}
}
