package com.mhj.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] ar = {5, 1, 4};
		
		boolean check = true;
		
		//1. 데이터 추가
			//0번 인덱스에 추가
		//2. 데이터 삭제
			//0번 인덱스 삭제
		//3. 종료
		
		//========================번호 입력============================
		
			while (check) {
				System.out.println("===========================");
				System.out.println("1. 데이터 추가\n2. 데이터 삭제\n3. 종료");
				System.out.println("번호를 입력하세요.");
				int select = sc.nextInt();
				
				if (select == 1) {
					System.out.println("데이터를 추가합니다.");
					System.out.println("추가하고 싶은 데이터를 입력해 주세요.");
					
					select = sc.nextInt();
					int [] copy = new int [ar.length+1];
					copy[0] = select;
					
					for (int i=0; i<ar.length; i++) {
						copy[i+1] = ar[i];
					}
					
					ar = copy;
					
				} else if (select == 2) {
					int [] copy = new int[ar.length-1];
					
					for (int i=0; i<copy.length; i++) {
						copy[i] = ar[i+1];
					}
					
					ar = copy;
					
				} else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				System.out.println("===========================");
				System.out.println("보유 데이터");
				for (int i=0;i<ar.length;i++) {
					System.out.println(ar[i]);
				}
				
		}	

	}

}
