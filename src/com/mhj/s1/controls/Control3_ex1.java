package com.mhj.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		
		//Game : TRPG
		//마법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		
		//1. HP 회복 (포션)
		//2. MP 회복 (포션)
		//HP, MP 보충 시 최대 40
		//보충 시 랜덤하게 0~40 사이의 숫자를 받아서 HP, MP에 더하기
		//3. 마법 공격 1
		//4. 마법 공격 2
		//5. 턴 넘기기
		
		System.out.println("1. HP 회복, 2. MP 회복, 3. 마법 공격 1, 4. 마법 공격 2, 5. 턴 넘기기");
		int select = sc.nextInt();
		
		if (select==1) {
			int hpPlus = random.nextInt(41);
			hp = hp + hpPlus;
			System.out.println("체력을 " + hpPlus + "만큼 회복했습니다.");
				if (hp > 40) {
					hp = 40;
				}
			System.out.println("HP : " + hp);
		} else if (select==2) {
			int mpPlus = random.nextInt(41);
			mp = mp + mpPlus;
			System.out.println("마나를 " + mpPlus + "만큼 회복했습니다.");
				if (mp > 40) {
					mp = 40;
				}
			System.out.println("MP : " + mp);
		} else if (select==3) {
			if (mp<3) {
				System.out.println("마나가 부족합니다.");
			} else {
				int damage = random.nextInt(6);
				monsterHp = monsterHp - damage;
				System.out.println("주문을 외웁니다.");
				System.out.println(monsterName + "에게 " + damage + "만큼의 데미지를 입혔습니다.");
				mp = mp - 3;
				if (damage == 0) {
					System.out.println("MISS");
				}
					if (monsterHp == 0) {
						System.out.println(monsterName + "이(가) 죽었습니다.");
					}
				}
		} else if (select==4) {
			if (mp<5) {
				System.out.println("마나가 부족합니다.");
			} else {
				int damage = random.nextInt(11);
				monsterHp = monsterHp - damage;
				System.out.println("주문을 외웁니다.");
				System.out.println(monsterName + "에게 " + damage + "만큼의 데미지를 입혔습니다.");
				mp = mp - 5;
				if (damage > 5) {
					System.out.println("크리티컬 공격!");
				}
				if (damage == 0) {
					System.out.println("MISS");
				}
					if (monsterHp == 0) {
						System.out.println(monsterName + "이(가) 죽었습니다.");
					}
				}
		} else {
			System.out.println("턴을 넘깁니다.");
		}
		
		System.out.println(name + " HP : " + hp + " MP : " + mp);
		System.out.println(monsterName + " HP : " + monsterHp);

	}
}

//선생님 답안
//System.out.println(1. HP 회복);
//System.out.println(2. MP 회복);
//System.out.println(3. 마법 공격 1);
//System.out.println(4. 마법 공격 2);
//System.out.println(5. 턴 종료);
//int select = sc.nextInt();
// 
//if(select==1) {
//	int h = random.nextInt(41);
//	hp = hp + h;	//20
// 	if (hp > 40) {
// 		hp = 40;
// 	}
// 	System.out.println(hp);
// 
//} else if(select==2) {
// 	int m = random.nextInt(41);
// 	if (mp > 40) {
// 		mp = 40;
// 		}
// 
//} else if(select==3) {
// 	int a = random.nextInt(6);
// 	monsterHp = monsterHp - a;
// 	//주문을 외우기
// 	//mp 3씩 감소
// 	//0~5 이하의 수치를 공격
// 	System.out.println(name + "은(는) " + monsterName + "에게 " + a + "데미지를 주었다.)
//} else if(select==4) {
// 	int a = random.nextInt(11);
// 	monsterHp = monsterHp - a;
// 	//주문을 외우기
// 	//mp 5씩 감소
// 	//0~10 이하의 수치를 공격
// 	System.out.println(name + "은(는) " + monsterName + "에게 " + a + "데미지를 주었다.)
//} else {
// 	System.out.println("턴을 넘깁니다.");
//} 
// 
////유저의 이름, HP, MP
//System.out.println(name + " HP : " + hp + " MP : " + mp);
////몬스터의 이름과 HP 출력
//System.out.println(monsterName + " HP : " + monsterHp);
