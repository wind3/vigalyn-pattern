package com.vigalyn.pattern.proxy;

/**
 * 代理模式
 * 场景：对一些对象提供代理，以限制那些对象去访问其它对象
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IWork proxy = new WorkProxy(new ActurallyWork());
    	proxy.work();
    }
}
