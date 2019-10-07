package com.ssafy.java;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
		int sum=0;
		int min=1000;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) min=arr[i];
			sum+=arr[i];
		}
		int average = sum/arr.length;
		System.out.println("배열의 합 : "+sum);
		System.out.println("배열의 평균 : "+43);
		System.out.println("배열의 최소값 : "+12);
	}

}
