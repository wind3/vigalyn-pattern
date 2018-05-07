package com.vigalyn.pattern.callback;

public class DoAndCallback {
	
	private ICallback callback ;
	
	public DoAndCallback(ICallback callback) {
		this.callback =  callback;
	}
	
	public void doSomethingAndCallback() {
		doSomething();
		if (callback != null) {
			System.out.println("DoAndCallback后回调");
			callback.execute();
		}
	}

	public void doSomething() {
		System.out.println("DoAndCallback先处理");
	}
	
}
