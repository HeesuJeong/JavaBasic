package edu.ssafy.chap09;


//스레드 구현방법 
//1. Thread 생성받기
public class ThreadTest1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		test();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start.......");
		
		//test();
		ThreadTest1 th=new ThreadTest1(); //하나의 스택이 새로 생성
		th.start(); //start 메소드 호출하면 run함수를 호출한다. 
		//스레드 생성시 stack이 하나 더 생긴다. top프레임이 main인 스택하나/ top프레임이 run인 스택하나.
		//두 top frame이 cpu번갈아 사용해(context switching)
		
		//스택이 두 개이므로 main이 실행된 스택이 끝나도.. 다른 스택이 남아잇으므로 프로그램이 종료되지 않는다.
		
		System.out.println("Main End.......");
	}
	
	//한 스택 이내라면 test함수가 끝나야 main이 끝난다.
	static void test() {
		System.out.println("test.start");
		try {
			Thread.sleep(5000);             
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test.end");
	}

}
