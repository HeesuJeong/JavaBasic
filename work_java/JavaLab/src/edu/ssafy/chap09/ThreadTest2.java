package edu.ssafy.chap09;

public class ThreadTest2 extends Thread {

	public ThreadTest2(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(""+i+Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		
		//스레드 순서 뒤죽박죽인걸 볼 수 있다=> 동기화 어려워
		ThreadTest2 th=new ThreadTest2("th0");
		ThreadTest2 th1=new ThreadTest2("th1");
		ThreadTest2 th2=new ThreadTest2("th2");
		th.start(); //thread 시작하는 start() => run()을 실행시킨다.
		th1.start();
		th2.start();
		System.out.println("main end");
	}

}
