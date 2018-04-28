package com.vigalyn.pattern.facade;

/**
 * 门面模式
 * 场景：为子系统的一组接口提供一个统一的访问接口（入口）
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Facade facade = new Facade();
    	facade.doA();
    	facade.doB();
    	facade.doC();
    }
}
