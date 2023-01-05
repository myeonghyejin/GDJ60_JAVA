package com.mhj.sc4.objects4;

public class GodMain {

	public static void main(String[] args) {

		//singleTon
		//전체 프로그램 중에 객체가 딱 1개를 만들게끔 유도하는 디자인 패턴
		
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God : " + god);
		System.out.println("Name : " + god.getName());
		
		god = God.getInstance();
		
		System.out.println("God : " + god);
		System.out.println("Name : " + god.getName());

	}

}
