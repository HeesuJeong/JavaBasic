package day06;
/*
 * 1.Thread�� ��ӹ޾� run overriding
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
			System.out.println("go2 :"+Thread.currentThread());//Thread.currentThread()�ϸ� ���� ȣ���� thread?�� �� �� ���� 
		}
		
	}

	static void go() {
		System.out.println("go");
		go2();
	}

	public static void main(String[] args) { //main thread�� ������ go�� �����ϴ� thread�� ������ �ʾ���.. stack���� �������� 
		System.out.println("Main Start");

		Thread1 th = new Thread1();
		th.start();
		Thread1 th2 = new Thread1();
		th2.start();
		System.out.println("Main End");
	}

}
