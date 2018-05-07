package com.vigalyn.pattern.eventDriven.event;

import com.vigalyn.pattern.eventDriven.Entity.Car;

public class CarSaledEvent extends AbstractEvent {
	private Car car;
	
	public CarSaledEvent() {
	}
	
	public CarSaledEvent(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}
}
