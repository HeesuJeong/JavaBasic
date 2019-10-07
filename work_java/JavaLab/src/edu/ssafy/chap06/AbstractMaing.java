package edu.ssafy.chap06;

public class AbstractMaing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest s=new Sub(); 
		s.show(); //sub의 show가 호출돼
		
		AbstractTest s2=new Sub2();
		
		AbstractTest[] arr =new AbstractTest[2];
		arr[0]=s;
		arr[1]=s2;
		
		toShow(s); //s의 show가 호출돼************
		toShow(s2); //s2의 show가 호출돼
	}
	static void toShow(AbstractTest at) {
		at.show();
	}

}
