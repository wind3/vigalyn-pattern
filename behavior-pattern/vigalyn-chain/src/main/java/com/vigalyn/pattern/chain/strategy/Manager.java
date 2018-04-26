package com.vigalyn.pattern.chain.strategy;

public class Manager implements IHandler {

	private ChainNode node;
	
	public boolean canExecute() {
		return node != null;
	}
	
	public void setChainNode(ChainNode node) {
		this.node = node;
	}

	public void execute() {
		System.out.println("Manager执行一些业务逻辑，移交下一个");
		node.handle();
	}
}
