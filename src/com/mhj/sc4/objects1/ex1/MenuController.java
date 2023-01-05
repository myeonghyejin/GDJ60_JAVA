package com.mhj.sc4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	
	public void start () {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		Student [] students = new Student[count];		
		
		while (check) {		
			System.out.println("1. 학생 정보 입력 2. 학생 검색 정보 출력 3. 학생 전체 정보 출력 4. 학생 정보 추가 5. 종료\n번호를 입력하세요.");
			int select = sc.nextInt();
			
			if (select==1) {
				si.setAllStudents(students);
			} else if (select==2) {
				Student student = si.findStudent(students);
				if (student != null) {
					sv.view(student);
				} else {
					System.out.println("없는 번호입니다.");
				}
			} else if (select==3) {
				sv.view(students);				
			} else if (select==4) {	
				students = si.setStudent(students);
			} else if (select==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("오류\n다시 선택해 주세요.");
			}			
		}
		
	}

}
