package com.vigalyn.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IWatchedImpl implements IWatched {

	private List<IWatch> watcherList ;
	
	public IWatchedImpl() {
		watcherList = new ArrayList<IWatch>();
	}
	
	public void addWatcher(IWatch watch) {
		watcherList.add(watch);
	}

	public void removeWatcher(IWatch watch) {
		watcherList.remove(watch);
	}
	
	public void changeEvent() {
		System.out.println("事件发生，通知观察者");
		notifiyWatcher();
	}

	private void notifiyWatcher() {
		Iterator<IWatch> iter = watcherList.iterator();
		while(iter.hasNext()) {
			iter.next().execute();
		}
	}

}
