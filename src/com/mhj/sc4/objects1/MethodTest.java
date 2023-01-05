package com.mhj.sc4.objects1;

public class MethodTest {
	
	//메소드 선언 공식
	//public static void main(String [] args) {}
	//public - 접근지정자
	//static - [그 외 지정자]
	//void - 리턴 타입
	//main - 메소드명
	//(String [] args) - ([매개변수들] 선언)
	
	//[필요하면 쓰고 필요 없으면 생략] 표시
	
	//접근지정자 : 아직 모르겠거나 판단이 안 되면 public
	//그 외 지정자 : 생략
	//리턴 타입 : 아직 잘 모르겠거나 판단이 안 되면 void
	//메소드명 : 작명, 첫 글자 - 소문자
	//매개변수 : 생략
	
	public void t1() {	//메소드의 header, 선언부
		//{} 메소드의 body, 내용
		//제어문, 반복문 등등
		System.out.println("t1 메소드 실행");
		MethodTest2 mt2 = new MethodTest2();
		
		mt2.info();
		
		int num = 10;
		System.out.println("t1 num :" + num);
		System.out.println("t1 메소드 종료");
	}
	
	//t2 메소드 선언
	
	public void t2() {		
		System.out.println("t2 메소드 실행");
		int num = 20;
		System.out.println("t2 num :" + num);
		System.out.println("t2 메소드 종료");
	}

}
