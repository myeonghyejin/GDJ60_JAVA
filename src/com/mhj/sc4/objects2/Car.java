package com.mhj.sc4.objects2;

public class Car {
	
	static String company = "BMW";
	String name;
	int price;
	String color;
	
	{
		//초기화 블럭
		System.out.println("초기화 블럭 : " + this.company);
		this.company = "AUDI";
	}
	
	public Car() {
		
//		this("Black");						//생성자 내에서 다른 생성자 호출하는 구문
		System.out.println("생성자 : " + this.company);
		this.company = "KIA";
		this.name = "스포티지";
		this.price = 35000000;
		this.color = "Black";
		
	}
	
	public Car(String color) {
		this(color, 3500);
//		this.company = "KIA";
//		this.name = "스포티지";
//		this.price = 35000000;
//		this.color = color;
	}
	
	public Car(String color, int price) {
		this(color, price, "스포티지");
//		this.company = "KIA";
//		this.name = "스포티지";
//		this.price = price;
//		this.color = color;
	}
	
	public Car(String color, int price, String name) {
		this.company = "KIA";
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("회사 : " + this.company);
		System.out.println("가격 : " + this.price);
		System.out.println("색상 : " + this.color);
	}

}
