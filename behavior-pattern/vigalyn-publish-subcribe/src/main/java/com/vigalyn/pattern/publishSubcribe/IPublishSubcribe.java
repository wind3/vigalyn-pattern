package com.vigalyn.pattern.publishSubcribe;

public interface IPublishSubcribe extends IPublish, ISubcribe {
	
	public void addISubcribe(ISubcribe subcribe);
	
	public void removeISubcribe(ISubcribe subcribe) ;

}
