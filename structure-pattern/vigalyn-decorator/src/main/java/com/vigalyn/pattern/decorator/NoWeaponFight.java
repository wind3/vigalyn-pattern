package com.vigalyn.pattern.decorator;

public class NoWeaponFight implements IFighting {

	public void fight() {
		System.out.println("NoWeaponFight 赤手空拳战斗！");
	}

}
