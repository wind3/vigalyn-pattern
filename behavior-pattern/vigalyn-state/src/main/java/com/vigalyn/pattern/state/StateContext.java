package com.vigalyn.pattern.state;

public class StateContext {

	private IState state ;
	
	public void changeState(IState state) {
		this.state = state;
	}
	
	public void execute() {
		state.execute();
	}
}
