package com.mhj.sc4.objects5.characters;

public abstract class Character {
	
	private String name;
	private int hp;
	private int level;
	
	public Character(String name) {
		this.name = name;
	}
	
	public Character() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	

}
