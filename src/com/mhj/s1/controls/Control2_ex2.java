package com.mhj.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//초기화
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (kor + eng + math) / 3.0;
		
		//평균이 60점 이상인가?
		//과목당 40점 미만이면 불합격
		//합격 불합격 출력 
		
		if (kor<40 || eng<40 || math<40) {
			System.out.println("과락 불합격");
		} else {
			if (avg>=60) {
				System.out.println("합격");
			} else {
				System.out.println("평균 점수 미달 불합격");
			}
			
		}
		
	}

}

//선생님 답안 1
//if (avg >= 60 && kor >= 40 && eng >= 40 && math >=40) {
//} else {
//}


//선생님 답안 2
//if (avg>=60) {
//if (kor >= 40 && eng >= 40 && math >= 40) {
//  	System.out.println("합격");
//  	} else {
//  		System.out.println("불합격");
//  	}
//  	System.out.println("불합격");

//선생님 답안 3
//boolean flag = false;
//
//if (avg >= 60) {
//	flag = true;
//}
//
//if(flag) {
// 	if(kor<40 || eng <40 || math<40) {
// 		flag = false;
// 	} else {
// 		flag = true;
// 	}
//}
//
//if(flag) {
//	System.out.println("합격");
//} else {
//	System.out.println("불합격");
//}

