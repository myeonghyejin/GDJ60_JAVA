package com.mhj.s1.controls;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요.");
		int avg = sc.nextInt();
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//그 외 나머지 F
		//switch case 사용
		
		switch (avg) {
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("A");
			break;
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("B");
			break;
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
//		선생님 답안
//		
//		 switch(avg/10) {
//		 case 10:
//		 case 9:
//		 	System.out.println("A");
//		 	break;
//		 case 8:
//		 	System.out.println("B");
//		 	break;
//		 case 7:
//		 	System.out.println("C");
//		 	break;
//		 default:
//		 	System.out.println("F");
//		 	break;
		
	}

}
