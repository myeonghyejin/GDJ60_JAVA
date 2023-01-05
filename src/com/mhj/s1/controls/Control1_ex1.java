package com.mhj.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {
	
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
		
		String grade = ""; 
		
		total = kor + eng + math;
		avg = (kor + eng + math) / 3.0;
		
		if (avg>=90) {
			grade = "A";
		}
		
		if (avg>=80 && avg<90) {
			grade = "B";
		}
		
		if (avg>=70 && avg<80) {
			grade = "C";
		}
		
		if (avg<70) {
			grade = "F";
		}
		
		System.out.println(grade);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
