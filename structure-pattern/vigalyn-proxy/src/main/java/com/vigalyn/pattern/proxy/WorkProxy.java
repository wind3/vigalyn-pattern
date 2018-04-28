package com.vigalyn.pattern.proxy;

public class WorkProxy implements IWork {

	private IWork worker;
	
	public WorkProxy(IWork worker) {
		this.worker = worker;
	}
	
	public void work() {
		worker.work();
	}

}
