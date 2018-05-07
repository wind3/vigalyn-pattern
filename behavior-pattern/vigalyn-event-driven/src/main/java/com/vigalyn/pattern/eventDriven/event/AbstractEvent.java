package com.vigalyn.pattern.eventDriven.event;

import com.vigalyn.pattern.eventDriven.common.IEvent;

public abstract class AbstractEvent implements IEvent {

	public Class<? extends IEvent> getType() {
		return getClass();
	}

}
