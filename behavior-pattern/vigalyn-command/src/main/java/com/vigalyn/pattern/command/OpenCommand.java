package com.vigalyn.pattern.command;

public class OpenCommand implements ICommand {

	private Tv tv;
	
	public OpenCommand(Tv tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.open();
		System.out.println("OpenCommand 执行命令");
	}

}
