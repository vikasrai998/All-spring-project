package org.jsp.springdemo;

public class Employee {
	private double salary;
	private String desg;

	public Employee(double salary, String desg) {
		this.salary = salary;
		this.desg = desg;
	}

	public Employee() {
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

}
