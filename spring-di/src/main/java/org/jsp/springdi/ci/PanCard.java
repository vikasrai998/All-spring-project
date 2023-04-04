package org.jsp.springdi.ci;

public class PanCard {
	private String number;
	private String place;

	public void displayAttributes() {
    	System.out.println("Number:"+number);
    System.out.println("Place:"+place);
    }

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
