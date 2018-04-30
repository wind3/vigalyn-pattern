package com.vigalyn.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Workstation {
    
    private List<IWork> workerList;
    
    public Workstation() {
        workerList = new ArrayList<IWork>(); 
        payWorkers() ;
    }
    
    private void payWorkers() {
        WorkerFactory factory = new WorkerFactory();
        workerList.add(factory.createWorker(WorkTypeEnum.ONE));
        workerList.add(factory.createWorker(WorkTypeEnum.ONE));
        workerList.add(factory.createWorker(WorkTypeEnum.TWO));
        workerList.add(factory.createWorker(WorkTypeEnum.TWO));
        workerList.add(factory.createWorker(WorkTypeEnum.THREE));
        workerList.add(factory.createWorker(WorkTypeEnum.THREE));
    }
    
    public void getAllWorker(){
        for (IWork worker : workerList) {
            worker.execute();
        }
        
    }
    
    
}
