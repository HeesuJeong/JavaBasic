package edu.ssafy.chap03;

import java.util.*; //util안 모든 것 가져온다
//모두 가져온다고 코드가 커진다? No 
//=>컴파일 하고 나서 사라지고 java.util.ArrayList 이렇게 바뀐다


public class Operation {
	int a; //멤버 변수
	//멤버 메소드
	static void name() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		ArrayList a;
		HashSet set;
		name(); //static인 메인함수 안에서는 static 함수만 호출 가능
	}

	//클래스 안에 클래스 선언 가능
	class Hello {
	}
}
