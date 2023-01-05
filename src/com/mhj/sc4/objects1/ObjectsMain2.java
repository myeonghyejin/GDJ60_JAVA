package com.mhj.sc4.objects1;

public class ObjectsMain2 {

	public static void main(String[] args) {

		//객체 생성
		//Sword의 Instance 생성
		
		Sword s1 = new Sword();
		
		s1.name = "집행검";
		s1.durability = 200;
		s1.damage = 50;
		s1.intension = 3;
		
		Knight knight = new Knight();
		knight.name = "물주먹";
		knight.strong = 100;
		knight.hp = 100;
		knight.stamina = 50;
		knight.dexterity = 30;
		knight.wisdom = 10;
		
		knight.sword = s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		Sword s2 = null;	//지역 변수, 참조 변수
							//초기화를 하지 않아 사용할 수 없음
		
		
		System.out.println(s2.damage);

	}

}
