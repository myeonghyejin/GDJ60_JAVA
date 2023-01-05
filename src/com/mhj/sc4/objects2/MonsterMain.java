package com.mhj.sc4.objects2;

public class MonsterMain {

	public static void main(String[] args) {

		Monster mon1 = new Monster();		//객체 생성
		mon1.power = 10;
		mon1.hp = 100;
		Monster mon2 = new Monster();
		mon2.power = 10;
		mon2.hp = 100;
		
		
		
//		System.out.println(mon1 == mon2);
		
		boolean result = mon1.checkValue(mon2);
						//this			//Monster monster
//		boolean result = mon2.checkValue(mon1);
						//this			//Monster monster
		
		System.out.println("Result : " + result);
		
//		System.out.println(mon1);			//'주소'를 담고 있음
//		mon1.info();						//this = 생성된 객체의 주소
//		System.out.println(mon2);			//'주소'를 담고 있음
//		mon2.info();						//this = 생성된 객체의 주소
		
	}

}
