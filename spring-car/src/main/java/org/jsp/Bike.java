package org.jsp;

import org.springframework.stereotype.Component;

@Component(value="myBike")
public class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike has been started");
	}
}
