package com.vigalyn.pattern.publishSubcribe;

import java.util.ArrayList;
import java.util.List;

public class OnePublish implements IPublish {
	
	private List<IPublishSubcribe> pubSubComponentList;
	
	public OnePublish() {
		this.pubSubComponentList = new ArrayList<IPublishSubcribe>();
	}
	
	public void addIPublishSubcribe(IPublishSubcribe pubSubComponent) {
		pubSubComponentList.add(pubSubComponent);
	}
	
	public void removeIPublishSubcribe(IPublishSubcribe pubSubComponent) {
		pubSubComponentList.remove(pubSubComponent);
	}

	public void publish(ISubject subject) {
		for (IPublishSubcribe temp : pubSubComponentList) {
			temp.publish(subject);
		}
	}

}
