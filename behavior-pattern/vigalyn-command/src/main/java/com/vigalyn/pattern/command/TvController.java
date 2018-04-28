package com.vigalyn.pattern.command;

public class TvController {

	private ICommand open,close,change;
	
	public TvController(ICommand open,ICommand close,ICommand change) {
		this.open = open;
		this.close = close;
		this.change = change;
	}
	
	public void open() {
		open.execute();
	}
	
	public void close() {
		close.execute();
	}
	
	public void change() {
		change.execute();
	}
}
