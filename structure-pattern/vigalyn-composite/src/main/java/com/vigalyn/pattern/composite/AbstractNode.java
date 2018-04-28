package com.vigalyn.pattern.composite;

public abstract class AbstractNode {

	protected String name;

	void addNode( AbstractNode node) {
		throw new RuntimeException("没有权限");
	}
	
	void removeNode(AbstractNode node) {
		throw new RuntimeException("没有权限");
	}
	
	void eachChild() {
		throw new RuntimeException("没有权限");
	}
}
