package com.vigalyn.pattern.adapter;

/**
 * 适配器模式
 * 场景：需要将接口转换为其他接口时
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ServiceProvider provider = new ServiceProvider();
    	Adapter adapter = new Adapter(provider);
    	adapter.execute();
    }
}
