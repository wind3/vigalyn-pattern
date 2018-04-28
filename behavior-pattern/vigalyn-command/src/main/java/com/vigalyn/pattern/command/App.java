package com.vigalyn.pattern.command;

/**
 * 命令模式
 * 场景：需要将请求的调用者和执行者分离时；
 * 遵循的设计原则：依赖倒置原则、开闭原则、里氏替换原则、合成复用原则
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Tv tv = new Tv();
    	OpenCommand open = new OpenCommand(tv);
    	CloseCommand close = new CloseCommand(tv);
    	ChangeCommand change = new ChangeCommand(tv);
    	
    	TvController controller = new TvController(open,close,change);
    	
    	controller.open();
    	controller.change();
    	controller.close();
    }
}
