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
		
		//���� ����
		int[] arr2=new int[arr.length+1];
		arr2=arr; //��ü�ּҸ� ���� 
		System.out.println(arr2.length);
		System.out.println(arr2[2]);
		arr[2]=100;
		//�ϳ��� ��ü�� arr�� arr2 �θ��� �ٶ󺸰� �־�
		System.out.println(arr2[2]);
		
		
		System.out.println("=================");
		//���� ����
//		arr2[3]=arr[3];
//		arr2[2]=arr[2];
//		arr2[1]=arr[1];
//		arr2[0]=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i]=arr[i];
//		}
		
		System.arraycopy(arr, 0, arr2, 0, 4);
		
		for(int i:arr2) System.out.println(i); //i�� �ε����� �ƴ϶� value��
		
		System.out.println(arr2.length);
		System.out.println(arr2[1]);
		arr[1]=100;
		//�ϳ��� ��ü�� arr�� arr2 �θ��� �ٶ󺸰� �־�
		System.out.println(arr2[1]);
		
	}

}
