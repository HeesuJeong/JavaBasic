package edu.ssafy.ch01;

public class LoopTest2 {
	public static void main(String[] args) {
		int cnt=0;
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(i+" X "+j+" = "+i*j);
				cnt++;
			}
		}
		System.out.println(cnt);
		
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
