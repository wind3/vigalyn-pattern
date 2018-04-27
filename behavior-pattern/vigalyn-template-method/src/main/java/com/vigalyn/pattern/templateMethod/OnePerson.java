package com.vigalyn.pattern.templateMethod;

public class OnePerson extends AbstractParent {

	@Override
	void eat() {
		System.out.println("OnePerson在吃");
	}

	@Override
	void sleep() {
		System.out.println("OnePerson在睡");
	}

}
