package com.mhj.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//분과 초를 입력 받아서
		//해당 분 초가 되면 반복문을 모두 종료

		int min = 0;
		int sec = 0;
		boolean check = false;
		
		System.out.println("분(min)을 입력하세요.");
		min = sc.nextInt();
		System.out.println("초(sec)를 입력하세요.");
		sec = sc.nextInt();
		
		for (int m=0; m<60; m++) {
			
			for(int s=0; s<60; s++) {
				System.out.println(m + "분" + s + "초");
				
				if(min==m && sec==s) {
//					s = 60;
//					m = 60;
					check = true;
					break;
				}
				
			}//안쪽 for 끝
			
			if (check) {
				break;
			}
			
		}//바깥 for 끝
		
		System.out.println("프로그램 종료");
		
	}//main 끝

}//class 끝
