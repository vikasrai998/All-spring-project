package org.jsp.springdi;

public class Car {
	private Engine e;

	public void startcar() {
		e.start();
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

}
