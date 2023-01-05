package com.mhj.sc4.objects3.p1;

public class Member {
	
	//비만관리 회원 등록
	private String name;
	private int age;
	private double height;
	private double weight;
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public Member() {
		
	}
	
	public Member(int age) {
		if(age>0 && age<200) {
			this.age = age;
		}
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//setter 메소드
	//set + 변수명의 첫 글자를 대문자로 바꾼 것
	public void setAge(int age) {
		if(age>0 && age<200) {
			this.age = age;		
		}
	}
	
	//getter 메소드
	//get + 변수명의 첫 글자를 대문자로 바꾼 것
	public int getAge() {
		return this.age;
	}
	
	public void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : " + this.weight);
	}

}
