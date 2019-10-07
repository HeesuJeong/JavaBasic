package edu.ssafy.chap04;

public class DayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		
		//8이상부터 앞에 0붙으면 8진수
		//앞에 0X붙으면 16진수
		Date d1=new Date(2019,7,22);
		System.out.println(d.info());
		System.out.println(d1.info());
		
		//d1.day=31; //private이므로 다른 클래스에서 접근 불가
		
		d1.setYear(2111);
		d1.setMonth(20);
		
		System.out.println(d1.info());
	}

}
