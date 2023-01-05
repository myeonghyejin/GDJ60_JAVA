package com.mhj.sc4.objects5.characters;

public class Archer extends Character implements AttackAble {

	private int dex;
	
	public Archer() {
		super("");
	}
	
	@Override
	public void attack() {
		System.out.println("화살 공격");
	}
	
	public void move() {
		System.out.println("이동~");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
	
}
