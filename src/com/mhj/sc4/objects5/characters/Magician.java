package com.mhj.sc4.objects5.characters;

public abstract class Magician extends Character {
	
	private int mp;
	
	public Magician() {
		super("");
		System.out.println();
	}
	
	public abstract void attack();
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public abstract void spell();

}