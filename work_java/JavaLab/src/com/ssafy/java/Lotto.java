package com.ssafy.java;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ζ��� �ְ���ڸ� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		int max = s.nextInt();

		int[] lotto = new int[6];

		boolean chk = false;
		int cnt = 0;
		
		
		while (cnt < 6) {
			int val = (int) (Math.random() * 100 % 45 + 1);
			for (int tmp : lotto) {
				if (val == tmp) {
					chk = true; //������ ���� �ִ� ���
					break;
				}
			}
			if (chk == false) {	//������ �� ���� ���
				lotto[cnt++] = val;
			} else {//������ �� �ִ� ���
				chk=false;
				continue;
			}
				
		}

		for (int i : lotto) {
			System.out.println(i);
		}

	}

}
