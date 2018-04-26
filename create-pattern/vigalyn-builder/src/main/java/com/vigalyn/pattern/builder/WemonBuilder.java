package com.vigalyn.pattern.builder;

public class WemonBuilder implements PersonBuilder {

	Person person ;
	
	public WemonBuilder() {
		person = new Man();
	}
	
	public void buildHead() {
		person.setHead("women head");
	}

	public void buildBody() {
		person.setBody("women body");
	}

	public void buildFoot() {
		person.setFoot("women foot");
	}

	public Person buildPerson() {
		return person;
	}

}
