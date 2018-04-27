package com.vigalyn.pattern.publishSubcribe;

public class OneSubcribe implements ISubcribe {

	public void subcribe(ISubject subject) {
		System.out.println(subject.getDesc());
	}


}
