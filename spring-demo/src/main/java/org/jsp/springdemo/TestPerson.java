
package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPerson {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("mySpringConf.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Person p = factory.getBean("myPerson", Person.class);
		System.out.println("Name:" + p.getName());
		System.out.println("Age:" + p.getAge());
	}
}
