package edu.ssafy.ch01;

import java.util.Random;

public class condition {
	public static void main(String[] args) {
		boolean b=false;
		int a=new Random().nextInt(101);
		/*if(a>=90){
			System.out.println("A");
		}else if(a>=70){
			System.out.println("B");
		}else {
			System.out.println("F");
		}*/
		
//		System.out.println(a);
		//switch�� ����񱳿� ���
		//�Ǽ����� �� ��
		//char�� ���ڿ� ���� => �ƽ�Ű ������ �� �� => �빮�� A 65 �ҹ��� a 97 
//		System.out.println((int)'a');
//		switch (a) {
//		case 100:
//			System.out.println("A");
//			break;
//		case 90:
//			System.out.println("B");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		System.out.println(a);
		a=a/10; //���� ������ ������ ����
		
		switch (a) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	}
}
