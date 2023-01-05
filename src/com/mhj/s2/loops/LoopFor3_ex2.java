package com.mhj.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {

		//배틀그라운드
		//총알 30발 -> 1탄창
		//캐릭터 당 3탄창

		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		
		Scanner sc = new Scanner(System.in);
		
		int load = 0;													//장전
		for (;load<3;load++) {
			System.out.println("1. 단발, 2. 점사 \n번호를 입력하세요.");
			int select = sc.nextInt();
			if (select == 1) {		
				for (int i = 0; i<30; i++) {
					System.out.println("탕");
				}
			System.out.println("장전");
			continue;
			} else if (select == 2) {
				for (int i = 0; i<30; i=i+3) {
					System.out.println("타타탕");
					} 
			System.out.println("장전");
			continue;
			} else {
			System.out.println("오류 \n1, 2번 중에 입력하세요.");
			}
		
		}
		
		System.out.println("총알 소진");
		
	}//main 끝

}//class 끝

//선생님 답안
//
//Scanner sc = new Scanner(System.in);
//
//for(int t=1;t<4;t++) {
//	System.out.println("1. 단발 2. 점사");
//	int select = sc.nextInt();
//	
//	System.out.println(select);
//	
//	int count = 10;
//	String sound = "타타탕";
//
//	if(select==1) {
//		count = 30;
//		sound = "탕";
//	}
//
//	for(int b=0;b<count;b++) {
//		System.out.println((b+1) + "번째 소리 : " + sound);
//	}
