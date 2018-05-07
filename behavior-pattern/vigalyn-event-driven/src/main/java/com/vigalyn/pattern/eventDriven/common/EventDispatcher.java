package com.vigalyn.pattern.eventDriven.common;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {
	Map<Class<? extends IEvent>, IHandler< ? extends IEvent>> map;
	
	public EventDispatcher() {
		this.map = new HashMap<>();
	}
	
	public <T extends IEvent> void registerHandler(Class<T>clazz ,IHandler<T> handler) {
		map.put(clazz, handler);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends IEvent> void dispatch(T event) {
		IHandler<T> handler = (IHandler<T>) map.get(event.getClass()) ;
		if (handler != null) {
			handler.onEvent(event);
		}
	}
}
