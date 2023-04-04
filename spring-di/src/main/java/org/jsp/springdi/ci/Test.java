package org.jsp.springdi.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personcard.xml");
		Person p = context.getBean("myPerson", Person.class);
		p.getCard().displayAttributes();
	}
}
