package com.vigalyn.pattern.eventDriven.common;

public interface IEvent {

	Class<? extends IEvent> getType();
}
