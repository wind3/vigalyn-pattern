package com.vigalyn.pattern.templateMethod;

public abstract class AbstractParent {

	abstract void  eat();
	
	abstract void  sleep();
	
	public void  talk() {
		System.out.println("大家都说中国话");
	}
}
