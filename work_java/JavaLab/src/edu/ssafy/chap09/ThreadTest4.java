package edu.ssafy.chap09;

public class ThreadTest4 {

	static int st;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread3 th1 = new MyThread3();
		MyThread4 th2 = new MyThread4();
		th1.start();
		th2.start();
		System.out.println("Main End........");
	}

}

class MyThread3 extends Thread {
	static int st;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			ThreadTest4.st++;
		}
		System.out.println("mytherad3: "+ThreadTest4.st);
	}
}
class MyThread4 extends Thread {
	static int st;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			ThreadTest4.st--;
		}
		System.out.println("mytherad4: "+ThreadTest4.st);
	}
}
