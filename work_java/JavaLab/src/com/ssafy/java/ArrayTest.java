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
		System.out.println("�迭�� �� : "+sum);
		System.out.println("�迭�� ��� : "+43);
		System.out.println("�迭�� �ּҰ� : "+12);
	}

}
