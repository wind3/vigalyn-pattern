package com.vigalyn.pattern.chain.tempMethod;

public abstract class Handler {

	protected Handler nextHandler;
	
	public abstract void execute();
	
	public Handler getNextHandler() {
		return nextHandler;
	}
	
	public   void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
