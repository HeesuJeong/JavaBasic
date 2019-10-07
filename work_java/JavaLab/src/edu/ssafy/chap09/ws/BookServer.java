package edu.ssafy.chap09.ws;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class BookServer {

	private ServerSocket ssock;

	public BookServer() throws IOException {
		ssock = new ServerSocket(7000);
	}

	void go() throws IOException, ClassNotFoundException, Exception {
		while (true) {
			System.out.println("서버는 대기중....");
			Socket accept = ssock.accept();

			// 접속한 클라이언트 소켓을 인자로 넘겨준다
			new ClientThread(accept).start(); // 스레드의 run()이 실행되게 된다.

		}
	}

	// accept해서 클라이언트 응대하는 클래스
	private class ClientThread extends Thread {
		private Socket accept;

		public ClientThread(Socket accept) {
			// TODO Auto-generated constructor stub
			this.accept = accept;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;

			try {
				while (true) {
					ois = new ObjectInputStream(new BufferedInputStream(accept.getInputStream()));
					ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
					print(list);
//					 파일에 작성하기
					oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.ser")));
					oos.writeObject(list);
					oos.flush();  //버퍼에 남아있는 것을 파일에 써주는 거야!
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					oos.close();
					ois.close();
					accept.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}


	public void print(List<Book> li) {
		for (Book b : li)
			System.out.println(b.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new BookServer().go();
			System.out.println("서버실행 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//클라이언트에서 아웃풋,인풋 순서로 열었으면
//서버에서는 인풋,아웃풋 순서로 열어야해