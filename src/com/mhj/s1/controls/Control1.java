package com.mhj.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		
		//단일 if
		//if(조건식) { 조건식이 true일 때 실행 }
		//졸업 시험, 점수가 몇 점이든 간에 무조건 졸업, 평균이 90점 이상이면 우등상 수상
		
		System.out.println("프로그램 시작");
		
		double avg = 91.54;		// >, <...
		boolean check = true;
		int scholarship = 0;
		
		if(avg >= 90) {
			System.out.println("우등상을 수상하였습니다.");
			scholarship = 100000000;
			System.out.println("장학금 : " + scholarship);
			System.out.println(check);
		}	//if 끝
		
		System.out.println("졸업을 축하합니다.");
		System.out.println("프로그램 종료");

	}	//main 끝

}
