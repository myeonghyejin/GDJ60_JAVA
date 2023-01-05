package com.mhj.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//MMORPG 게임
		//1. 로그인
		//2. 로그인한 사용자만 게임 이용 가능
		
		//------------------------ 로그인 파트 ----------------------------
		//1. 로그인 2. 종료
		//	1: ID, PW 입력 후 로그인 판단
		//	2: 종료
		
		boolean check = false;
		int id = 1234;
		int pw = 5678;
		
		while (check) {
			System.out.println("1. 로그인\n2. 종료\n번호를 입력하세요.");
			int select = sc.nextInt();
			if (select==1) {
				System.out.println("ID를 입력하세요.");
				int yId = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				int yPw = sc.nextInt();
				
				if (id == yId && pw == yPw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("게임을 종료합니다.");
				check =! check;
			}
		}
		
		//------------------------ 게임 진행 파트 ----------------------------
		//1. 로그인 성공했을 때 진행
		//레벨은 1로 시작
		//GOLD는 0으로 시작
		//5레벨 달성 시 1,000G 지급
		//10레벨 달성 시 2,000G 지급
		//15레벨 달성 시 3,000G 지급
		//모든 몬스터의 경험치는 동일
		//레벨 1 -> 레벨 2 : 3마리
		//레벨 2 -> 레벨 3 : 6마리
		//레벨 3 -> 레벨 4 : 9마리
		//레벨 4 -> 레벨 5 : 12마리
		// ...
		//레벨 14 -> 레벨 15 : 52마리
		//만렙 달성 축하, 현재 GOLD 출력
		
		if (!check) {			
			int level = 1;
			int gold = 0;
			
			for (level=1;level<15;level++) {
				System.out.println("현재 LEVEL : " + level);
				
				if (level%5==0) {
					gold = gold + level/5*1000;
					System.out.println("[+" + level + "레벨 달성 축하금]");
				}
				
//				if (level==5) {
//					System.out.println("5레벨 달성 축하금");
//					gold = gold + 1000;
//				}
//				
//				if (level==10) {
//					System.out.println("10레벨 달성 축하금");
//					gold = gold + 2000;
//				}
					
				
				for (int m=0; m<level*3; m++) {
					System.out.println(m+1+"번째 사냥");
				}
				
				System.out.println(1+level + "LEVEL 달성 축하");
				System.out.println("현재 GOLD : " + gold + "G");
			}
			
			System.out.println("만렙 달성!");
			System.out.println("[+만렙 달성 축하금]");
			gold = gold + level/5*1000;
			System.out.println("현재 GOLD : " + gold + "G");
		}
		
	}

}
