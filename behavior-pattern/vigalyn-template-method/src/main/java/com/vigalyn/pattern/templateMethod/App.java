package com.vigalyn.pattern.templateMethod;


/**
 * 模板方法模式
 * 场景：公共的行为在父类实现，子类实现个性化方法；
 * 遵循的设计原则：开闭原则、里氏替换原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractParent  person = new OnePerson();
    	person.eat();
    	person.sleep();
    	
    	person = new TwoPerson();
    	person.eat();
    	person.sleep();
    }
}
