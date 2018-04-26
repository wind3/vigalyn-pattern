package com.vigalyn.pattern.strategy;

/**
 * 策略模式
 * 场景：有时需要根据不同的情况，采用不同的算法或者策略来完成业务功能
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StrategyContext context = new StrategyContext(new OneStrategy());
    	context.doSomething();
    	
    	context.changeStrategy(new TwoStrategy());
    	context.doSomething();
    	
    	context.changeStrategy(new ThreeStrategy());
    	context.doSomething();
    	
    }
}
