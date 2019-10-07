package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int store[] = {0,0,0,0,0,0,0,0,0,0};
		System.out.println("100미만의 숫자 10개를 입력하세요");
		Scanner s =new Scanner(System.in);
		int tmp;
		while(true) {
			tmp=s.nextInt();
			if(tmp==0) break;
			store[tmp/10]++;
		}
		for (int i = 0; i < store.length; i++) {
			System.out.println(i+" : "+store[i]+"개");
		}
	}

}
