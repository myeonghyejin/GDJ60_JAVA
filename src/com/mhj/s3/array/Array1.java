package com.mhj.s3.array;

public class Array1 {

	public static void main(String[] args) {

		//primitive type(원시형, 기본형)
		//숫자[(정수형:byte, short, int, long), 실수(float, double)], 문자, 논리형
		
		//reference type
		//String
		
		double d1 = 1.2;
		d1 = 5.3;
		
		//변수 선언 공식
		//데이터타입 변수명;
		
		if(d1>0) {
			int num = 10;	//지역 변수
		}
		
		//배열 선언 공식
		//모으려고 하는 데이터 타입 [] 변수명
		
		double [] ar = new double[2];
		int [] ar2 = new int[3];
		System.out.println(d1);
		System.out.println(ar);
		
		
		ar [1] = 5.2; 
		
		System.out.println(ar[0]);
		
		System.out.println(ar2[0]);
		
		int [] ar3 = {1,2,3};
		int ar4 [] = {2,3,4};
		//index
		for (int i=0;i<3;i++) {
			System.out.println(ar3[i]);
		}

	}

}
