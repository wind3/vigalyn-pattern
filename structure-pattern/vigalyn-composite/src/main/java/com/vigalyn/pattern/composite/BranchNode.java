package com.vigalyn.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends AbstractNode {
	
	private List<AbstractNode> childList ;
	
	public BranchNode(String name) {
		super.name = name;
		this.childList = new ArrayList<AbstractNode>();
	}
	
	@Override
	void addNode(AbstractNode node) {
		childList.add(node);
	}
	
	@Override
	void removeNode(AbstractNode node) {
		childList.remove(node);
	}
	
	@Override
	void eachChild() {
		System.out.println("BranchNode is " + super.name);
		for (AbstractNode node : childList) {
			node.eachChild();
		}
	}
}
