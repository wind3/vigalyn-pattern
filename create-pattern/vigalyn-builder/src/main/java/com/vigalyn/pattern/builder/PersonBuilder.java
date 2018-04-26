package com.vigalyn.pattern.builder;

/**
 * 建造者模式
 * @author zengwj
 *
 */
public interface PersonBuilder {

	void buildHead();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson();
}
