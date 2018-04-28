package com.vigalyn.pattern.command;

public class ChangeCommand implements ICommand {

	private Tv tv;
	
	public ChangeCommand(Tv tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.change();
		System.out.println("ChangeCommand 执行命令");
	}

}
