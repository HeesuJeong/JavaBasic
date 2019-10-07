package edu.ssafy.chap09;

public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th2.start();
		th1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// th1.stop();

		/*
		 * 스레드 죽이는 방법 스레드의 스택을 비워버리는 것 (run method를 다 지우는 것) stop() 호출 ==> 좋은 방식 아니야
		 * (ex)파일 사용하고 있을 때 닫지도 않았는데 죽여버리면 파일이 안 닫힐 수 있어
		 */

		th1.interrupt(); // exception을 줘버려 =>catch로 잡히겟지

		System.out.println("Main End........");
	}

}

class MyThread1 extends Thread {
	@Override
	
	
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 100; i++) {
				sleep(100);
				System.out.println("MyThread1 : " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			try {
				sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread2 : " + i);
		}
	}
}