package com.vigalyn.pattern.templateMethod;

public class TwoPerson extends AbstractParent {

	@Override
	void eat() {
		System.out.println("TwoPerson在吃");
	}

	@Override
	void sleep() {
		System.out.println("TwoPerson在睡");
	}

}
