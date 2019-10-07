package edu.ssafy.chap09;

public class ThreadTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스레드 만드는 방법
		//1. Thread 상속받아 run override
		//2. Runnable을 상속받는 클래스를 만들어 Thread에게 전달 =>run메소드 만들어 스레드에게 전달하기 위하여
		
		//1번 방식 간단히
		Thread th=new Thread() {
			public void run() {
				
			};
		};
		th.start();
		
		//2번 방식 간단히
		//인터페이스인 Runnable의 미구현 method인 run을 구현시켜 객체를 인자로 넘겨준다.
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		th1.start();
		
	}

}
