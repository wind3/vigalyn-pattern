package com.vigalyn.pattern.abstrct.factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BenzFactory foctory = new ChinaBenzFactory();
        
        Car car = foctory.createCar();
        Bus bus = foctory.createBus();
        Bike bike = foctory.createBike();
    }
}
