package com.vigalyn.pattern.eventDriven.handler;

import com.vigalyn.pattern.eventDriven.common.IHandler;
import com.vigalyn.pattern.eventDriven.event.CarSaledEvent;

public class CarSaledHandler implements IHandler<CarSaledEvent> {

	@Override
	public void onEvent(CarSaledEvent event) {
		System.out.println("触发CarSaledEvent事件："+event.getCar().getName());
	}

}
