package org.jsp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean {
	static {
		System.out.println("Demo class is loaded into memory");
	}

	public Demo() {
		System.out.println("Demo Object is getting created");
	}

	public void display() {
		System.out.println("Hello from Demo");
	}

	public void destroy() throws Exception {
		System.out.println("Demo is destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo is Initialised");
	}
}
