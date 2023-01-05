package com.mhj.sc4.objects2;

public class Monster {
	
	//멤버 변수 (Instance 변수)
	int power=10;
	int hp=100;									//멤버 변수, Heap 영역에 생성
	
	//생성자 (Constructor)
	public Monster () {
		//매개 변수가 없는 생성자를 기본 생성자라고 부름, default constructor
		this.power = 50;
		this.hp = 60;
		System.out.println("생성자 실행");
	}
	
	public Monster(int power) {
		
	}
	
	//멤버 메소드 (Instance Method)
	
	public boolean checkValue(Monster monster) {
		
		//나의 power와 같고 나의 hp와 같다면 ture 리턴
		//둘 중에 하나라도 다르면 false 리턴
		
		if(this.power == monster.power && this.hp == monster.hp) {		
			return true;
		} else {
			return false;
		}
		
	}
	
	//공격
	
	//어슬렁
	public void info() {
		//참조 변수 this
		//생성된 (자기 자신) 객체 주소를 담고 있음
		//class 내부에서만 사용 가능
		//this는 생략 가능
		
		System.out.println(this);
		System.out.println(this.power);
		System.out.println(hp);				//this 생략
		
		attack();							//this 생략
	}
	
	public void attack() {
		System.out.println("공격합니다.");
		//this.info();						//무한 반복
	}
	
	public void setHp(int hp) {				//매개 변수, 지역 변수, Stack 영역에 생성
		this.hp = hp;						//멤버 변수 = 매개 변수, 지역 변수 (글자 색깔 참조!)
											//이럴 때는 구분을 위해 this 명시해 주는 게 좋음
	}

}
