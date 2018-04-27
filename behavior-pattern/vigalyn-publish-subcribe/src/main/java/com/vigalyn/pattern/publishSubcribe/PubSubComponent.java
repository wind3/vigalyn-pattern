package com.vigalyn.pattern.publishSubcribe;

import java.util.ArrayList;
import java.util.List;

public class PubSubComponent implements IPublishSubcribe {
	
	//订阅者
	private List<ISubcribe> subList ; 

	public PubSubComponent() {
		subList = new ArrayList<ISubcribe>();
	}
	
	public void addISubcribe(ISubcribe subcribe) {
		subList.add(subcribe);
	}
	
	public void removeISubcribe(ISubcribe subcribe) {
		subList.remove(subcribe);
	}

	public void subcribe(ISubject subject) {
		for (ISubcribe sub : subList) {
			sub.subcribe(subject);
		}
	}

	public void publish(ISubject subject) {
		for (ISubcribe sub : subList) {
			sub.subcribe(subject);
		}
	}


}
