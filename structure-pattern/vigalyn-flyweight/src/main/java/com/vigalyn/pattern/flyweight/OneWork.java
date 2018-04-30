package com.vigalyn.pattern.flyweight;

public class OneWork implements IWork {

    public void execute() {
        System.out.println("OneWork 执行任务" + this.hashCode());
        
    }

}
