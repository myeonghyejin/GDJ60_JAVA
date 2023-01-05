package com.mhj.sc4.objects1;

public class MethodTest3 {
	
	public void t3(int salary, double tax) {
		//실급여 계산하는 메소드
		salary = (int)(salary*tax);
		System.out.println("t3 : " + salary);
	}
		
		
		public void info(Sword sword) {
			//Sword 모든 정보를 출력
			System.out.println(sword.name);
			System.out.println(sword.damage);
			sword.name = "단도";
	}

}
