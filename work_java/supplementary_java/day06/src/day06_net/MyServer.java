package day06_net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 멀티 클라이언트 서버 
 * 내부클래스를 만들어서 스레드를 상속받게 하니까  MyServer는 다른거 상속받아서 쓸 수 있게 됨 
 * 
 */
public class MyServer extends Object{
	class ServerThread extends Thread {
		Socket s;

		public ServerThread(Socket s) {
			this.s = s;
		}

		@Override
		public void run() {
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			try {
				while (true) {
					ois = new ObjectInputStream(this.s.getInputStream());
					oos = new ObjectOutputStream(this.s.getOutputStream());
					Object readObject = ois.readObject();
					oos.writeObject(readObject);
					oos.flush();
				}
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					oos.close();
					ois.close();
					this.s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	ServerSocket ss;

	public MyServer() {
		
	}

	private void go() {
		try {
			while (true) {
				ss = new ServerSocket(9000);
				Socket accept = ss.accept();
				new ServerThread(accept).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyServer().go();
	}

}
