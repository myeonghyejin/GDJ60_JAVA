package com.mhj.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		
		//1. 학생 수 입력
		//2. 학생 수만큼 이름 입력
		//3. 학생 수만큼 학생의 번호, 국어, 영어, 수학 입력
		//	a 학생의 번호 :
		//	a 학생의 국어 :
		// 	a 학생의 영어 :
		//	a 학생의 수학 :
		//	총점	평균	계산
		
		//모든 학생의 정보 출력
		//	이름	번호	국어	영어	수학	총점	평균
		//	iu	1	53	63	52
		//	...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		int [] students = new int[count];
		
		String [] names = new String[count];

		int [] nums = new int[count];
		int [] kor = new int[count];
		int [] eng = new int[count];
		int [] math = new int[count];
		int [] total = new int[count];
		double [] avg = new double[count];
		
		for (int i=0;i<students.length;i++) {
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요.");
			names[i] = sc.next();
		}
		
		while (true) {
			for (int i=0;i<students.length;i++) {
				System.out.println(names[i] + " 학생의 번호를 입력하세요.");
				nums[i] = sc.nextInt();
				System.out.println(names[i] + " 학생의 국어 점수를 입력하세요.");
				kor[i] = sc.nextInt();
				System.out.println(names[i] + " 학생의 영어 점수를 입력하세요.");
				eng[i] = sc.nextInt();
				System.out.println(names[i] + " 학생의 수학 점수를 입력하세요.");
				math[i] = sc.nextInt();
				total[i] = kor[i] + eng[i] + math[i];
				avg[i] = (kor[i] + eng[i] + math[i]) / 3.0;
			}
			break;
		}

		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		
		for (int i=0;i<students.length;i++) {
			System.out.print(names[i] + "\t");
			System.out.print(nums[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(total[i] + "\t");
			System.out.println(avg[i] + "\t");
			System.out.println("-----------------------------------------------");
		}

	}

}
