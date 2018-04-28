package com.vigalyn.pattern.composite;

/**
 * 组合模式
 * 场景：组建单个对象与组合对象的部分与整体的层次结构（树形结构）
 * 遵循的设计原则：
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractNode root = new BranchNode("root");
        AbstractNode branch1 = new BranchNode("branch1");
        AbstractNode branch2 = new BranchNode("branch2");
        root.addNode(branch1);
        root.addNode(branch2);
        
        AbstractNode leaf1 = new LeafNode("leaf1");
        AbstractNode leaf2 = new LeafNode("leaf2");
        branch1.addNode(leaf1);
        branch1.addNode(leaf2);
        
        AbstractNode leaf3 = new LeafNode("leaf3");
        branch2.addNode(leaf3);
        
        root.eachChild();
        branch1.eachChild();
        branch2.eachChild();
    }
}
