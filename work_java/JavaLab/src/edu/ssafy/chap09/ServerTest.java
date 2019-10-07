package edu.ssafy.chap09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// 서버는 열어만 주면 되니깐 port만 알면 됨
		ServerSocket ss = new ServerSocket(7000);
//		BufferedReader br = null;
//		BufferedWriter bw = null;
		
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		try {
			while (true) {
				System.out.println("서버는 기다리는 중...");
				Socket cli = ss.accept(); // 클라이언트가 접속 올 때까지 기다리고 있어
				// 접속한 클라이언트의 소켓으로 리턴돼

//				InputStream is = cli.getInputStream();
//				// 프로세스 스트림 사용하기
//				// 문자열 읽을거야 bufferedreader
//				br = new BufferedReader(new InputStreamReader(is));
//
//				String str = br.readLine();
//				System.out.println("client으로부터 날라온 문자열 \t" + str);

				ois=new ObjectInputStream(new BufferedInputStream(cli.getInputStream()));
				Customer cus=(Customer)ois.readObject();
				System.out.println("client으로부터 날라온 문자열 "+cus.toString());
//				bw = new BufferedWriter(new OutputStreamWriter(cli.getOutputStream()));
//				bw.write(str + " -서버로부터 날아온 문자열\n");
//				bw.flush();
				
				oos=new ObjectOutputStream(new BufferedOutputStream(cli.getOutputStream()));
				oos.writeObject(cus);
				oos.flush();
			}
		} catch (IOException e) {

		} finally {
//			bw.close();
//			br.close();
			ois.close();
			oos.close();
			ss.close();
		}
	}

}
