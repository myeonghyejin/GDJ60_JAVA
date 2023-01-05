package com.mhj.s3.array;

public class Array8 {

	public static void main(String[] args) {

		int [] ar = {9, 5, 8, 3, 6};
		
		//9, 8, 6, 5, 3으로 출력 (내림차순 정렬)
		//3, 5, 6, 8, 9로 출력 (오름차순 정렬)
		//0번 인덱스 값을 1번, 2번, 3번, 4번 인덱스랑 비교
		//1번 인덱스 값을 2번, 3번, 4번 인덱스랑 비교
		//2번 인덱스 값을 3번, 4번 인덱스랑 비교
		//...
		//더 큰 숫자를 왼쪽으로 보냄 (자리 바꿈)
		//0 : 1, 2, 3, 4	95836
		//1 : 2, 3, 4		98536
		//2 : 3, 4			98635
		//3 : 4				98653
		//이중 for문
		
		int save = 0;
		
		for (int i=0; i<ar.length; i++) {
			for (int j=i+1; j<ar.length; j++) {
				if (ar[i] < ar[j]) {
					save = ar[i];
					ar[i] = ar[j];
					ar[j] = save;
				} 
			}
		}
		
		//=======================================출력
		
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
