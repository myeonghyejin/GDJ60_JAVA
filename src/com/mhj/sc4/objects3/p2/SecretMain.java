package com.mhj.sc4.objects3.p2;

import com.mhj.sc4.objects3.p1.Secret;

public class SecretMain {

	public static void main(String[] args) {

		Secret secret = new Secret();
		com.mhj.sc4.objects3.p2.Secret secret = new com.mhj.sc4.objects3.p2.Secret();
		
//		secret.money=1;
		
		secret.s1();
		//secret.s2
		
//		System.out.println("시작 ");
		
		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);
	}

}
