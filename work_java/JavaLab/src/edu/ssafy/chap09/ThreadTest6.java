package edu.ssafy.chap09;

class MyRunnable implements Runnable{
	//Runnable interface에는 run()메소드 있다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}
public class ThreadTest6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main start");
		MyRunnable r =new MyRunnable();
		Thread th=new Thread(r);
		th.start();
		System.out.println("main end");
	}

}
