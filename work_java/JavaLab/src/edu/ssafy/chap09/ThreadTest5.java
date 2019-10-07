package edu.ssafy.chap09;

public class ThreadTest5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 th1 = new MyThread5();
		MyThread6 th2 = new MyThread6();
		th1.start();
		th2.start();
		System.out.println("Main End...........");
	}

	static Data d = new Data();
}

class Data{
	int st;
}

class MyThread5 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (ThreadTest5.d) {
				ThreadTest5.d.st++;
			}
			
		}
		System.out.println("mythread3 : " + ThreadTest5.d.st);
	}
	synchronized void incre(Data d) {
		ThreadTest5.d.st++;
	}
}

class MyThread6 extends Thread {
	@Override
	public  void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (ThreadTest5.d) {
				ThreadTest5.d.st--;
			}
			
		}
		System.out.println("mythread4 : " + ThreadTest5.d.st);
	}
}
