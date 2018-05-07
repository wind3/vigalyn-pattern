package com.vigalyn.pattern.asyncCallback;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 *异步回调模式
 * 场景：异步调用，回调
 * 遵循的设计原则：
 * @author zengwj
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
    {
    	ExecutorService executor = Executors.newFixedThreadPool(5);
    	Callable<Result> callback1 = new OneCallback<Result>(new Result("zengwj"));
    	Callable<Result> callback2 = new OneCallback<Result>(new Result("vigalyn"));
    	FutureTask<Result> task1 = new FutureTask<Result>(callback1);
    	FutureTask<Result> task2 = new FutureTask<Result>(callback2);
    	
    	executor.execute(task1);
    	executor.execute(task2);
    	
    	System.out.println("当前线程：" + Thread.currentThread());
    	Result result1 = task1.get();
    	Result result2 = task2.get();
    	System.out.println(result1.getName());
    	System.out.println(result2.getName());
    	
    	Callable<Result> call = Executors.callable(new Runnable() {
			@Override
			public void run() {
				System.out.println("当前线程：" + Thread.currentThread()+"正在执行");
			}},  new Result("wind3"));
    	Future<Result> future = executor.submit(call);
    	System.out.println(future.get().getName());
    	
    	executor.shutdown();
    }
}
