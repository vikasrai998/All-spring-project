package org.jsp.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployees {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employees.xml");
		Employees emps = context.getBean("emps", Employees.class);
		System.out.println(emps.getNames());
		System.out.println(emps.getIds());
		System.out.println(emps.getDetails());
	}
}
