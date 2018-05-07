package com.vigalyn.pattern.asyncCallback;

import java.util.concurrent.Callable;

public class OneCallback<V> implements Callable<V> {

	private V value ;
	
	OneCallback(V value ){
		this.value = value;
	}
	@Override
	public V call() throws Exception {
		System.out.println("当前线程：" + Thread.currentThread() + "执行回调方法！");
		return value;
	}

}
