package edu.ssafy.chap10;


//람다표현식은 기능이 아니라 코드를 줄일 수 잇는 표현식!

interface Printer{
	void print(String str);
}

//람다는 미구현 함수가 하나인 인터페이스에 사용된다.
public class RamdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 바로 객체화 하면 에러떠
		//메서드 오버라이드를 바로 해주면 돼
		Printer p=new Printer() {
			@Override
			public void print(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
			}};  
		p.print("hello");
		
		//Ramda Expression
		Printer p2=(String s)->{System.out.println(s);};
		p2.print("Ramda1");
		
		//중괄호 생략 가능
		Printer p3=(String s)->System.out.println(s+"hihhi");
		p3.print("Ramda2");
		
		//인자 하나이기 때문에 string 알아서 매칭 돼
		Printer p4=(String s)->System.out.println(s);
		p4.print("Ramda4");
		
		Printer p5=s->System.out.println(s);
		p5.print("simple is the best");
		
		//미구현함수가 하나인 Runnable 인터페이스 
		Runnable r=()->{System.out.println("one");
		System.out.println("two");};
		r.run();
		
		/////////////////////////////////////////////////
		Thread th=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}});
		
		//
		Thread th1=new Thread(()->System.out.println("runnable testing"));
		th1.start();
	}

}

//class MyPrinter implements Printer{
//
//	@Override
//	public void print(String str) {
//		// TODO Auto-generated method stub
//		System.out.println(str);
//	}
//	
//}