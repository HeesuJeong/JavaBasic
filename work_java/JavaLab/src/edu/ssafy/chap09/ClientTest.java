package edu.ssafy.chap09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//클라이언트는 연결 신청을 해줘야 하기 때문에 ip,port모두 알아야한다.
		
		//localhost 혹은 127.0.0.1로 부프백 주소 사용 가능
		Socket ser=new Socket("localhost",7000);
		
		Scanner s=new Scanner(System.in);
		
//		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(ser.getOutputStream()));
//		String send=s.next();
		
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(ser.getOutputStream()));
		System.out.println("서버에 보낼 이름 나이 주소를 입력하세요");
		String name=s.next();
		int age=s.nextInt();
		String addr=s.next();
		Customer c=new Customer(name, age, addr);
		oos.writeObject(c);
		oos.flush();
		
//		bw.write(send+"\n");
//		bw.flush();
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(ser.getInputStream()));
//		
//		String recieve=br.readLine();
//		System.out.println(recieve);
//		br.close();
//		bw.close();
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(ser.getInputStream()));
		Customer cus=(Customer) ois.readObject();
		System.out.println(cus.toString());
		ois.close();
		ser.close();
	}

}
