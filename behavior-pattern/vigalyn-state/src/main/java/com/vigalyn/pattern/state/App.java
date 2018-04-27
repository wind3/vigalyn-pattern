package com.vigalyn.pattern.state;

/**
 * 状态模式
 * 场景：当某个实体需要根据当前所处的状态，改变行为时；
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StateContext context = new StateContext();
    	OneState one = new OneState();
    	TwoState two = new TwoState();
    	
    	context.changeState(one);    	
    	context.execute();
    	
    	context.changeState(two);    	
    	context.execute();
    }
}
