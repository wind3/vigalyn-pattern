package com.vigalyn.pattern.eventDriven.common;

public interface IHandler<T extends IEvent> {

	void onEvent(T event);
}
