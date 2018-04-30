package com.vigalyn.pattern.flyweight;

import java.util.EnumMap;

public class WorkerFactory {

    private EnumMap<WorkTypeEnum,IWork> map ;
    
    public WorkerFactory() {
        map = new EnumMap<WorkTypeEnum, IWork>(WorkTypeEnum.class);
    }
    
    public IWork createWorker(WorkTypeEnum workerType) {
        IWork worker = map.get(workerType);
        if(worker != null) {return worker;}
        switch(workerType) {
        case ONE : 
            worker = new OneWork();
            map.put(WorkTypeEnum.ONE, worker);
            break;
        case TWO : 
            worker = new TwoWork();
            map.put(WorkTypeEnum.TWO, worker);
            break;
        case THREE : 
            worker = new ThreeWork();
            map.put(WorkTypeEnum.THREE, worker);
            break;
        default : break;
        }
        
        return worker;
    }
}
