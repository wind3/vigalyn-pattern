package com.vigalyn.pattern.decorator;

public class GunFight implements IFighting {

	private IFighting fight;
	
	public GunFight(IFighting fight) {
		this.fight = fight;
	}
	
	public void fight() {
		fight.fight();
		System.out.println("GunFight枪战");
	}

}
