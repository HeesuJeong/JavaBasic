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
		System.out.println(div); //���α׷����� ���� ������ ������ �����̴�
		System.out.println(oper1/(float)oper2); //�ϳ��� �Ǽ��̸� ��� �Ǽ�
		System.out.println(oper1%oper2);
		
		
		Random r =new Random();
		int val = r.nextInt(100)%45+1; //0���� 99
		System.out.println(val);
	}

}
