package com.vigalyn.pattern.chain.strategy;

public interface IHandler {
	
	boolean canExecute();
	
	void execute();
}
