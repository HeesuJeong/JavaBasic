package edu.ssafy.chap10.hw;

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

	void go() throws IOException {
		while (true) {
			System.out.println("서버는 대기중...");
			Socket accept = ssock.accept();

			// 접속한 클라이언트 소켓을 인자로 넘겨준다.
			new ClientThread(accept).start();
		}
	}

	private class ClientThread extends Thread {
		private Socket accept;

		public ClientThread(Socket accept) {
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
					
					//파일에 저장하기
					oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("hwdata.dat")));
					oos.writeObject(list);
					oos.flush();
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
			System.out.println("서버 실행 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
