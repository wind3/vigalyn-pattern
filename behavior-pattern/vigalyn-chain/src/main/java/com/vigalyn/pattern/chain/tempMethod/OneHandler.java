package com.vigalyn.pattern.chain.tempMethod;

public class OneHandler extends Handler {

	@Override
	public void execute() {
		System.out.println("OneHandler执行了一些业务逻辑后，再移交给下一个");
		if (getNextHandler() != null) {
			getNextHandler().execute();
		}else {
			System.out.println("执行业务逻辑，结束责任链");
		}
	}
}
