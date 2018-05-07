package com.vigalyn.pattern.callback;

/**
 * 回调模式
 * 场景：一个请求需要被多个对象进行处理时，可以将这些对象连成一条链，请求沿着链传递并被处理；
 * 遵循的设计原则：单一职责原则、
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DoAndCallback doAndCallback = new DoAndCallback(() ->System.out.println("ICallback开始回调"));
    	doAndCallback.doSomethingAndCallback();
    }
}
