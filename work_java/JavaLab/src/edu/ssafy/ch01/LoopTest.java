package edu.ssafy.ch01;

import java.util.Random;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		
		System.out.println("while ��");
		//while �ݺ���
		int condition=0;
		while(condition<6) {
			int val = r.nextInt(100)%45+1;
			System.out.println(val);
			
			condition++;
		}
		

		System.out.println("do while ��");
		//do while�� => �� �� �����ؾ� �ϴ��� �� �� �ö� 
		do { //�켱 �� ���� ���� => �� ���� ������ �˻�
			int val = r.nextInt(100)%45+1;
			System.out.println(val);
			condition++;
		}while(condition==6);
			

		System.out.println("for��");	
		//for �ݺ���
		
		//�Լ� �ȿ��� ���Ǵ� ������ ��������
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
