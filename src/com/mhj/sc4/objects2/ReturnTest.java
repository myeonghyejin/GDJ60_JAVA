package com.mhj.sc4.objects2;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	public void t1() {
		System.out.println("return이 없을 때는 void");
	}
	
	public int t2() {
		Random random = new Random();
		System.out.println("return은 int 타입");
		return random.nextInt(50);
	}
	
	public int[] t3() {
		int [] ar = new int[3];

		return ar;
		
	}

}
