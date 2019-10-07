package edu.ssafy.chap02;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][3];
		int tmp=10;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j]=tmp;
				tmp+=10;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println("=================");
		
		//동적 배열 가능
		int[][] arr2=new int[3][];
		arr2[0]=new int[5];
		arr2[0]=new int[10];
		
	}//class
}
