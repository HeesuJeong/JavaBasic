package day06;
/*
 * 2. Runnable �� overriding �Ͽ� Thread���� �����ϴ� ��� 
 * Thread ���� ��� = start
 * Thread ���� ��� = interrupt(��õ) or stop 
 */
class My implements Runnable {
	public void run() {
		try {
			while (true) {

				Thread.sleep(2 * 1000);
				System.out.println("run : " + Thread.currentThread());

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("thread end!!!");
		}
	}
}

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread());
		Thread th = new Thread(new My());
		th.start();

		Thread th2 = new Thread(new My());
		th2.start();
		Thread.sleep(5 * 1000);
		th2.interrupt();
		// th.stop();

	}
}
