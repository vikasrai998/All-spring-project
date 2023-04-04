package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("mySpringConf.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Employee e = factory.getBean("emp", Employee.class);
		System.out.println(e.getDesg());
		System.out.println(e.getSalary());
	}
}
