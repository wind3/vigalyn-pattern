package com.vigalyn.pattern.flyweight;

public class ThreeWork implements IWork {

    public void execute() {
        System.out.println("ThreeWork 执行任务" + this.hashCode());
    }

}
