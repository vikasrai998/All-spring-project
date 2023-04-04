package org.jsp.controller;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("ABC");
		user.setPhone(9999);
		user.setPassword("a123");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);
		dao.saveUser(user);
	}
}
