package edu.ssafy.chap08;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int res=0;
		
		try {
			res=div(a,b);
		}catch(ArithmeticException e) {
			System.out.println("에러 받았다!");
			res=100/res;   //함수 실행에서 예외 안 받았다면 이부분에서 또 에러 발생했을 것이다
		}catch(MyDataInputException e) {
			e.showError();
		}
		System.out.println(res);
	}

	//함수에서 에러 발생하면 메인에게 알리기 위해 throws
	static int div(int a,int b) throws ArithmeticException, MyDataInputException{
		//int res=a/b;
		//System.out.println("????????");
		
		int res=0;
		if(b==0) {
			throw new MyDataInputException("0을 입력하지 마세요!!");
		}
		res=a/b;
		return res;
	} 
}
