package com.vigalyn.pattern.decorator;

/**
 * 装饰者模式
 * 场景：需要包装增强同类接口的时候
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IFighting fight = new NoWeaponFight();
    	fight.fight();
    	
    	fight = new GunFight(fight);
    	fight.fight();
    }
}
