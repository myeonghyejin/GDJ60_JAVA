package com.mhj.sc4.objects5.characters;

public class Knight extends Character implements AttackAble {
	
	int strong;
	
	Weapon weapon = new Sword();
	
	@Override
	public void attack() {
		
		weapon.a();
		
	}

}
