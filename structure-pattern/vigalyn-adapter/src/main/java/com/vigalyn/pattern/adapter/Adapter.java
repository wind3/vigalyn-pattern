package com.vigalyn.pattern.adapter;

public class Adapter implements ITarget {

	private ServiceProvider serviceProvider;
	
	public Adapter(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public void execute() {
		serviceProvider.doSomething();
	}

}
