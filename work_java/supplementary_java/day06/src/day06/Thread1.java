package day06;
/*
 * 1.Thread를 상속받아 run overriding
 */

public class Thread1 extends Thread {
	@Override
	public void run() {
		go();
	}

	static void go2() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("go2 :"+Thread.currentThread());//Thread.currentThread()하면 나를 호출한 thread?를 알 수 있음 
		}
		
	}

	static void go() {
		System.out.println("go");
		go2();
	}

	public static void main(String[] args) { //main thread가 끝나도 go를 실행하는 thread는 끝나지 않았음.. stack에도 남아있음 
		System.out.println("Main Start");

		Thread1 th = new Thread1();
		th.start();
		Thread1 th2 = new Thread1();
		th2.start();
		System.out.println("Main End");
	}

}
