package edu.ssafy.ch01;

import java.util.Scanner;

public class HW_JAVA_0715_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번 문제");
		System.out.println("반지름이 5Cm인 원의 넓이는 "+5*5+"Cm2입니다");
		
		System.out.println("2번 문제");
		System.out.println("두 개의 정수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		System.out.println(input1*input2);
		System.out.println(input1/input2);
		
		System.out.println("3번 문제");
		int height = scan.nextInt();
		int kg = scan.nextInt();
		int test =kg+100-height;
		System.out.println("비만수치는 "+test+"입니다");
		if(test>0) System.out.println("당신은 비만입니다");
	}

}
