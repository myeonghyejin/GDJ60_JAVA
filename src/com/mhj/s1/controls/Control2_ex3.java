package com.mhj.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
	
	public static void main(String[] args) {
		
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로부터 ID와 PW를 입력 받아 로그인 처리
		
		Scanner sc = new Scanner(System.in);
		
		int id2 = 0;
		int pw2 = 0;
		
		System.out.println("ID를 입력하세요.");
		id2 = sc.nextInt();
		System.out.println("Password를 입력하세요.");
		pw2 = sc.nextInt();
		
		if (id == id2 && pw == pw2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		if (id == id2 && pw == pw2) {
			System.out.println("급여를 입력하세요.");
			int pay = sc.nextInt();
			System.out.println("정규직이면 1을, 계약직이면 2를 입력하세요.");
			int choice = sc.nextInt();
			if (choice==1) {
				double total1 = pay-(pay*0.02)-(pay*0.03)-(pay*0.01)-(pay*0.01);
				System.out.println("실급여 : " + (int)total1);
			}
			if (choice==2) {
				double total2 = pay-(pay*0.033);
				System.out.println("실급여 : " + (int)total2);
			}
			if (choice!=1 && choice!=2) {
				System.out.println("오류");
			}
			
		}
		
		//로그인이 성공했을 때만 실행
		//급여를 입력
		//정규직이면 1을, 계약직이면 2를 입력
		//실급여 계산
		//정규직: 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직: 원천징수 3.3%
		//실급여 출력
		
	}

}

//선생님 답안
//boolean check = false;	//false : 로그인 X, true : 로그인 O
//
//if (id == id2 && pw == pw2) {
//	System.out.println("로그인 성공");
//	check = true;
//} else {
//	System.out.println("로그인 실패");
//	check = false;
//}
//
//if(check) {
//System.out.println("급여를 입력하세요.");
//int salary = sc.nextInt();
//
//System.out.println("정규직이면 1, 계약직이면 2를 입력하세요.");
//int select = sc.nextInt();
//
//if(select==1) {
//	System.out.println("정규직 선택");
//	
//	//고용보험
//	int tax1 = (int)(salary*0.02);
//	
//	//의료보험
//	int tax2 = (int)(salary*0.03);
//	
//	//국민연금
//	int tax3 = (int)(salary*0.01);
//	
//	//산재보험
//	int tax4 = (int)(salary*0.01);
//	
//	salary = salary - (tax1 + tax2 + tax3 + tax4);
//	
//} else {
//	System.out.println("계약직 선택");
//	
//	salary = (int)(salary*0.967);
//}
//
//System.out.println("실급여 : " + salary);
//
//} else {
//	System.out.println("로그인한 사용자만 이용 가능");
//}
//
//
//선생님 답안 2
// boolean check = false;	//false : 로그인 X, true : 로그인 O
//
//if (id == id2 && pw == pw2) {
//	System.out.println("로그인 성공");
//	check = true;
//} else {
//	System.out.println("로그인 실패");
//	check = false;
//}
//
//if(check) {
//System.out.println("급여를 입력하세요.");
//int salary = sc.nextInt();
//	
//System.out.println("정규직이면 1, 계약직이면 2를 입력하세요.");
//int select = sc.nextInt();
//	
//if(select==1) {
//	System.out.println("정규직 선택");
//		
//	//고용보험
//	tax = tax + (int)(salary*0.02);
//	
//	//의료보험
//	tax = tax + (int)(salary*0.03);
//	
//	//산재보험
//	tax = tax + (int)(salary*0.01);
//	 
//	//국민연금
//	tax = tax + (int)(salary*0.01);
//	
//	salary = salary - tax;
//	
//} else {
//	System.out.println("계약직 선택");
//	
//	salary = (int)(salary*0.967);
//}
//
//System.out.println("실급여 : " + salary);
//
// else {
//System.out.println("로그인한 사용자만 이용 가능");
//
