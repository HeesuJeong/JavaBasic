package edu.ssafy.ch01;

import java.util.Scanner;

public class HW_JAVA_0715_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1�� ����");
		System.out.println("�������� 5Cm�� ���� ���̴� "+5*5+"Cm2�Դϴ�");
		
		System.out.println("2�� ����");
		System.out.println("�� ���� ������ �Է��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		System.out.println(input1*input2);
		System.out.println(input1/input2);
		
		System.out.println("3�� ����");
		int height = scan.nextInt();
		int kg = scan.nextInt();
		int test =kg+100-height;
		System.out.println("�񸸼�ġ�� "+test+"�Դϴ�");
		if(test>0) System.out.println("����� ���Դϴ�");
	}

}
