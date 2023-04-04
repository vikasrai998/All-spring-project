package org.jsp.springdi;

public class Ride {
	private Car c;

	public Ride() {
	}

	public Ride(Car c) {
		this.c = c;
	}

	public void startRide() {
		c.startcar();
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}

}
