package com.vigalyn.pattern.singleton;

/**
 * 双重检验线程安全的单例
 * @author zengwj
 *
 */
public class DoubleLockThreadSafeSingleton {
	
	private volatile static DoubleLockThreadSafeSingleton instance = null;

	private DoubleLockThreadSafeSingleton() {}
	
	public static DoubleLockThreadSafeSingleton  getInstance() {
		DoubleLockThreadSafeSingleton result = instance;
		if (null == result) {
			synchronized(DoubleLockThreadSafeSingleton.class) {
				result = instance;
				if (null == result) {
					instance = new DoubleLockThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
