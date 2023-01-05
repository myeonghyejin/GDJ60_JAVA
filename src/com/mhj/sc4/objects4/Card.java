package com.mhj.sc4.objects4;

public class Card {
	
	//트럼프 카드
	private String shape;
	private int number;
	private String color;
	
	//클래스변수
	public static int size = 10;
	
	//Instance 초기화 블록
	{}
	
	//Static (변수) 초기화 블록
	static {
		Card.size = 50;
	}
	
	//클래스메소드
	public static void staticMethod() {
		Card.size = 10;
		System.out.println("Static Method");
//		System.out.println(this.shape);
	}
	
	public void info() {
		System.out.println("Shape : " + this.shape);
		System.out.println("Color : " + this.color);
		System.out.println("SNumber : " + this.shape);
		System.out.println("Size : " + Card.size);
		Card.staticMethod();
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
