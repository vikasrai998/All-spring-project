package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpringConf.xml");
		Car c = context.getBean("myCar", Car.class);
		c.start();
		System.out.println("-------------------");
		Person p = context.getBean("myPerson", Person.class);
		System.out.println("name:" + p.getName());
		System.out.println("Age:" + p.getAge());
		System.out.println("---------------------");
		Employee e = context.getBean("emp", Employee.class);
		System.out.println("Designation:" + e.getDesg());
		System.out.println("Salary:" + e.getSalary());
	}
}
