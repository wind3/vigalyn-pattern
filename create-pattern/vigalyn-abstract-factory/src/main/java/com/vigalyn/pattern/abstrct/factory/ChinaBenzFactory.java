package com.vigalyn.pattern.abstrct.factory;

public class ChinaBenzFactory implements BenzFactory {

    public Car createCar() {
        return new ChinaMakeCar();
    }

    public Bus createBus() {
        return new ChinaMakeBus();
    }

    public Bike createBike() {
        return new ChinaMakeBike();
    }
    
}
