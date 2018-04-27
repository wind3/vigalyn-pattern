package com.vigalyn.pattern.publishSubcribe;

public class OneSubject implements ISubject {

	public void execute() {
		System.out.println("OneSubject执行业务");
	}

	public String getDesc() {
		return "OneSubject 返回内容";
	}

}
