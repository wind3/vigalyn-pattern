package com.vigalyn.pattern.facade;

public class Facade {
	
	private ModuleA moduleA;
	private ModuleB moduleB;
	private ModuleC moduleC;
	
	public Facade() {
		moduleA = new ModuleA();
		moduleB = new ModuleB();
		moduleC = new ModuleC();
	}
	
	void doA() {
		moduleA.doA();
	}
	
	void doB() {
		moduleB.doB();
	}
	
	void doC() {
		moduleC.doC();
	}
}
