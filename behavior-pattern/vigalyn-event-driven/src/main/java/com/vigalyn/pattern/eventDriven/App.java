package com.vigalyn.pattern.eventDriven;

import com.vigalyn.pattern.eventDriven.Entity.Car;
import com.vigalyn.pattern.eventDriven.common.EventDispatcher;
import com.vigalyn.pattern.eventDriven.event.CarCreatedEvent;
import com.vigalyn.pattern.eventDriven.event.CarSaledEvent;
import com.vigalyn.pattern.eventDriven.handler.CarCreatedHandler;
import com.vigalyn.pattern.eventDriven.handler.CarSaledHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerHandler(CarCreatedEvent.class, new CarCreatedHandler());
        dispatcher.registerHandler(CarSaledEvent.class, new CarSaledHandler());
        
        Car car = new Car("奔驰");
        dispatcher.dispatch(new CarCreatedEvent(car));
        dispatcher.dispatch(new CarSaledEvent(car));
    }
}
