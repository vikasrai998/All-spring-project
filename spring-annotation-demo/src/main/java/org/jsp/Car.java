package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myCar")
public class Car {
	private String brand;
	@Value(value = "56565647.0")
	private double price;
	private String color;

	public String getColor() {
		return color;
	}

	@Value(value = "white")
	public void setColor(String color) {
		this.color = color;
	}

	public Car(@Value(value = "BMW") String brand) {
		this.brand = brand;
	}
	public void display() {
		System.out.println("Brand:" + brand);
		System.out.println("Price:" + price);
		System.out.println("Color:" + color);
	}
}
