package com.vigalyn.pattern.composite;

public class LeafNode extends AbstractNode {

	public LeafNode(String name) {
		super.name = name;
	}
	
	@Override
	void eachChild() {
		System.out.println("LeafNode is " + super.name);
	}
}
