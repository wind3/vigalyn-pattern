package com.vigalyn.pattern.chain.strategy;

public class ChainNode {
	
	private IHandler nextHandler;
	
	public ChainNode(IHandler nextHandler) {
		this.nextHandler =  nextHandler;
	}
	
	void handle() {
		if (nextHandler.canExecute() ) {
			nextHandler.execute();
		}else {
			System.out.println("责任链结束");
		}
	}
}
