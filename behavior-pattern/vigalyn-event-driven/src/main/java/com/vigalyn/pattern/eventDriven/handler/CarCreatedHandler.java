package com.vigalyn.pattern.eventDriven.handler;

import com.vigalyn.pattern.eventDriven.common.IHandler;
import com.vigalyn.pattern.eventDriven.event.CarCreatedEvent;

public class CarCreatedHandler implements IHandler<CarCreatedEvent> {

	@Override
	public void onEvent(CarCreatedEvent event) {
		System.out.println("触发CarCreatedHandler事件："+event.getCar().getName());
	}

}
