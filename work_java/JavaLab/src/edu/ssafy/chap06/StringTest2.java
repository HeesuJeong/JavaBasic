package edu.ssafy.chap06;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		StringBuilder sb=new StringBuilder(str);
		sb.append("a");
		//"Hello"+"a" 보다 500배 이상 빠르다.
		System.out.println(sb);
	}

}
