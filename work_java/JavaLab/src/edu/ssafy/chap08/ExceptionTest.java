package edu.ssafy.chap08;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int res=0;
		try {
		res=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("분모가 0입니다.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("general한 예외");
		}finally {
			System.out.println("finally");
		}
		System.out.println("res : "+res);
		System.out.println("Program end");
	}

	//Arithmetic예외는 전형적인 런타임 에러이다 => 컴파일은 된다.
}
