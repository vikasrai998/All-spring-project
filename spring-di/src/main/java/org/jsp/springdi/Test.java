package org.jsp.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("carEngine.xml");
		Ride r = context.getBean("ride", Ride.class);
		r.startRide();
	}
}
