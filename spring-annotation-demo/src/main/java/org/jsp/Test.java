package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Person p = context.getBean("myperson", Person.class);
		p.displayPancard();
	}
}
