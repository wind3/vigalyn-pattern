package com.vigalyn.pattern.strategy;

public class StrategyContext {

	private IStrategy strategy;
	
	public StrategyContext() throws Exception {
		throw new Exception("请选择策略");
	}
	
	public StrategyContext(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void doSomething() {
		strategy.execute();
	}
}
