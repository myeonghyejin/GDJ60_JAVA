package com.mhj.s3.array;

public class Array3 {

	public static void main(String[] args) {

		//변수에는 같은 데이터타입만 대입 가능
		
		int num = 1;				//primitive type, 지역 변수
		String name = "IU";			//reference type, 지역 변수
		int [] ar1 = {1,2,3};		//reference type, 지역 변수
		int [] ar2 = {5,6,7,8};
		//배열은 한 번 만들어진 크기는 줄이거나 늘릴 수 없음
		
		//얕은 복사
		//주소만 넘겨주는 것
		ar1 = ar2;		//int 배열 타입
		ar2 = ar1;
		
//		ar1[0] = num;	//int 타입
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		
		System.out.println("==========================");
		
		for (int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
		
		for (int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
			
	}

}
