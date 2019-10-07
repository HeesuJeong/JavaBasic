package edu.ssafy.chap08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try {
			fos=new FileOutputStream("sample3.txt");
			dos=new DataOutputStream(new BufferedOutputStream(fos));
			dos.writeInt(256);
			dos.writeDouble(3.2525);
			dos.writeUTF("hello SSafy");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dos.close();
			fos.close();
		}
		
		DataInputStream dis=null;
		dis=new DataInputStream(new BufferedInputStream(new FileInputStream("sample3.txt")));
		int a=dis.readInt();
		double b=dis.readDouble();
		String c=dis.readUTF();
		System.out.println(a+","+b+","+c);
	}

}
