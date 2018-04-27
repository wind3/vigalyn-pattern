package com.vigalyn.pattern.publishSubcribe;

/**
 * 发布-订阅模式
 * 场景：当一个对象状态改变了，要通知其他相关对象也做改变时；
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PubSubComponent component1= new PubSubComponent();
    	PubSubComponent component2 = new PubSubComponent();
    	
    	OnePublish one = new OnePublish();
    	one.addIPublishSubcribe(component1);
    	one.addIPublishSubcribe(component2);
    	
    	OneSubcribe oneSub = new OneSubcribe();
    	OneSubcribe twoSub = new OneSubcribe();
    	
    	component1.addISubcribe(oneSub);
    	component2.addISubcribe(oneSub);
    	
    	component1.addISubcribe(twoSub);
    	component2.addISubcribe(twoSub);
    	
    	one.publish(new OneSubject());
    }
}
