package com.vigalyn.pattern.observer;

/**
 * 观察者模式
 * 场景：当一个对象状态改变了，要通知其他相关对象也做改变时；
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IWatched watched = new IWatchedImpl();
    	IWatch oneWatcher = new OneWatcher();
    	IWatch twoWatcher = new TwoWatcher();
    	IWatch threeWatcher = new ThreeWatcher();
    	
    	watched.addWatcher(oneWatcher);
    	watched.addWatcher(twoWatcher);
    	watched.addWatcher(threeWatcher);
    	
    	watched.changeEvent();
    }
}
