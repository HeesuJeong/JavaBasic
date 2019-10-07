package com.ssafy.java;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("로또의 최고숫자를 입력하세요");
		Scanner s = new Scanner(System.in);
		int max = s.nextInt();

		int[] lotto = new int[6];

		boolean chk = false;
		int cnt = 0;
		
		
		while (cnt < 6) {
			int val = (int) (Math.random() * 100 % 45 + 1);
			for (int tmp : lotto) {
				if (val == tmp) {
					chk = true; //동일한 값이 있는 경우
					break;
				}
			}
			if (chk == false) {	//동일한 값 없는 경우
				lotto[cnt++] = val;
			} else {//동일한 값 있는 경우
				chk=false;
				continue;
			}
				
		}

		for (int i : lotto) {
			System.out.println(i);
		}

	}

}
