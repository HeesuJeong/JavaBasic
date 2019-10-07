package edu.ssafy.ch01;

import java.util.Random;

public class OperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, oper1 = 15, oper2 = 12;
		sum = oper1 + oper2;
		int min = oper1 - oper2;
		int cro = oper1 * oper2;
		int div = oper1 / oper2;
		System.out.println(sum);
		System.out.println(min);
		System.out.println((cro));
		System.out.println(div); //프로그램에서 정수 나누기 정수는 정수이다
		System.out.println(oper1/(float)oper2); //하나라도 실수이면 결과 실수
		System.out.println(oper1%oper2);
		
		
		Random r =new Random();
		int val = r.nextInt(100)%45+1; //0부터 99
		System.out.println(val);
	}

}
