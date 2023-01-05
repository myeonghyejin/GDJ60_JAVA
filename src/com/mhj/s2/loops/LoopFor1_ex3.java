package com.mhj.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		int id2 = 0;
		int pw2 = 0;
		String login = "";
		
		//로그인 시도 (총 5번 시도 가능)
		
		//반복문 종료 후
		//로그인이 성공했으면 "환영합니다." 출력
		//로그인이 실패했으면 "가까운 은행에 방문하세요." 출력
		

		for (int i=0;i<5;i++) {
			System.out.println("ID를 입력하세요.");
			id2 = sc.nextInt();
			System.out.println("Password를 입력하세요.");		
			pw2 = sc.nextInt();
			
			if (id == id2 && pw == pw2) {
				System.out.println("로그인 성공");
				login = "환영합니다.";
				i = 5;
			} else {
				System.out.println("로그인 실패");
				login = "가까운 은행을 방문하세요.";
				System.out.println("로그인 " + (i+1) + "회 시도");
				}
			}
			
			System.out.println(login);
			
	  }	

}

//선생님 답안
//
//int id = 1234;
//int pw = 5678;
//boolean check = false;
//
//for (int i=0;8<5;i++) {
//	System.out.println("ID를 입력");
//	int yId = sc.nextInt();
//	System.out.println("PW를 입력");
//	int yPw = sc.nextInt();
//	
//	if (yId==id && yPw==pw) {
//		System.out.println("로그인 성공");
//		check = true;
//		i = 5;
//	} else {
//		System.out.println("로그인 실패");
//	}
//	
//	if (check=true) {
//		System.out.println("환영합니다.");
//	} else {
//		System.out.println("은행을 방문하세요.");
//	}
//
//}


