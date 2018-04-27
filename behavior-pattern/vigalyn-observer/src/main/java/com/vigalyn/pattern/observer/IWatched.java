package com.vigalyn.pattern.observer;

public interface IWatched {

	void addWatcher(IWatch watch);
	
	void removeWatcher(IWatch watch);
	
	void changeEvent();
}
