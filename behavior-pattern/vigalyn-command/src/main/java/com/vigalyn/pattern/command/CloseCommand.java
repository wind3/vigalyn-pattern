package com.vigalyn.pattern.command;

public class CloseCommand implements ICommand {


	private Tv tv;
	
	public CloseCommand(Tv tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.close();
		System.out.println("CloseCommand 执行命令");
	}

}
