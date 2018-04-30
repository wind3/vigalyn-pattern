package com.vigalyn.pattern.flyweight;

public class TwoWork implements IWork {

    public void execute() {
        System.out.println("TwoWork 执行任务" + this.hashCode());
    }

}
