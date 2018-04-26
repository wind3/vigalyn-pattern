package com.vigalyn.pattern.singleton;

/**
 * 内部静态类实现的单例
 * @author zengwj
 *
 */
public class InnerClassSingleton {

	private InnerClassSingleton() {}
	
	public InnerClassSingleton getInstance() {
		return InnerClass.result;
	}
	
	private static class InnerClass{	
		private static InnerClassSingleton result = new InnerClassSingleton();
	}
}
