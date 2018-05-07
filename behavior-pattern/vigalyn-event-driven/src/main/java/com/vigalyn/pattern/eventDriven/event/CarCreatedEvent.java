package com.vigalyn.pattern.eventDriven.event;

import com.vigalyn.pattern.eventDriven.Entity.Car;

public class CarCreatedEvent extends AbstractEvent {
	private Car car;
	
	public CarCreatedEvent() {
	}
	
	public CarCreatedEvent(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

}
