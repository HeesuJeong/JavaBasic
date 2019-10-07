package edu.ssafy.chap02;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7};
		//System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=================");
		
		//얕은 복사
		int[] arr2=new int[arr.length+1];
		arr2=arr; //객체주소를 대입 
		System.out.println(arr2.length);
		System.out.println(arr2[2]);
		arr[2]=100;
		//하나의 객체를 arr과 arr2 두명이 바라보고 있어
		System.out.println(arr2[2]);
		
		
		System.out.println("=================");
		//깊은 복사
//		arr2[3]=arr[3];
//		arr2[2]=arr[2];
//		arr2[1]=arr[1];
//		arr2[0]=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i]=arr[i];
//		}
		
		System.arraycopy(arr, 0, arr2, 0, 4);
		
		for(int i:arr2) System.out.println(i); //i는 인덱스가 아니라 value값
		
		System.out.println(arr2.length);
		System.out.println(arr2[1]);
		arr[1]=100;
		//하나의 객체를 arr과 arr2 두명이 바라보고 있어
		System.out.println(arr2[1]);
		
	}

}
