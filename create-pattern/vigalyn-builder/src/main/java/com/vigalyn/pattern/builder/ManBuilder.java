package com.vigalyn.pattern.builder;

public class ManBuilder implements PersonBuilder {

	Person person ;
	
	public ManBuilder() {
		person = new Man();
	}
	
	public void buildHead() {
		person.setHead("man head");
	}

	public void buildBody() {
		person.setBody("man body");
	}

	public void buildFoot() {
		person.setFoot("man foot");
	}

	public Person buildPerson() {
		return person;
	}

}
