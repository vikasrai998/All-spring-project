package org.jsp.springdi.ci;

public class Person {
	private PanCard card;

	public Person() {
	}

	public Person(PanCard card) {
		this.card = card;
	}

	public PanCard getCard() {
		return card;
	}

	public void setCard(PanCard card) {
		this.card = card;
	}

}
