package com.vigalyn.pattern.singleton;

/**
 * 枚举类实现的单例
 * @author zengwj
 *
 */
public enum EnumSingleton {
	INSTANCE;
	
	public String getDesc() {
		return "EnumSingleton";
	}
}
