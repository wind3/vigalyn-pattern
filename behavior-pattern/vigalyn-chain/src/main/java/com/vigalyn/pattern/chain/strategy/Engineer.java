package com.vigalyn.pattern.chain.strategy;

public class Engineer implements IHandler {

	private ChainNode node;
	
	public boolean canExecute() {
		return node != null;
	}
	
	public void setChainNode(ChainNode node) {
		this.node = node;
	}

	public void execute() {
		System.out.println("Engineer执行一些业务逻辑，移交下一个");
		node.handle();
	}
}
