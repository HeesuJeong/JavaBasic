package day06;

public class SyncMain {

	public static SyncData data = new SyncData();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�떆�옉");
		new IncrementOne().start();
		new IncrementTwo().start();
		System.out.println("醫낅즺");
	}
}

class SyncData {
	int i;
}

class IncrementOne extends Thread {
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			synchronized (SyncMain.data) {
				SyncMain.data.i++;
			}
		}
		System.out.println("IncreOne i = " + SyncMain.data.i);
	}
}

class IncrementTwo extends Thread {
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			synchronized (SyncMain.data) {
				SyncMain.data.i++;
			}
		}
		System.out.println("IncreTwo i = " + SyncMain.data.i);
	}
}