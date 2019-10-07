package edu.ssafy.ch01;

import java.util.Random;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		
		System.out.println("while 문");
		//while 반복문
		int condition=0;
		while(condition<6) {
			int val = r.nextInt(100)%45+1;
			System.out.println(val);
			
			condition++;
		}
		

		System.out.println("do while 문");
		//do while문 => 몇 번 수행해야 하는지 감 안 올때 
		do { //우선 한 번은 돌려 => 그 다음 조건을 검사
			int val = r.nextInt(100)%45+1;
			System.out.println(val);
			condition++;
		}while(condition==6);
			

		System.out.println("for문");	
		//for 반복문
		
		//함수 안에서 사용되는 변수가 지역변수
		for(int i =0;i<5;i++) {
			int val = r.nextInt(100)%45+1;
			System.out.println(val);
			System.out.println(i);
		}
		
		for(int a=4,b=1;a>=1;a--,b++) {
			System.out.println(a);
			System.out.println(b);
		}
	}

}
