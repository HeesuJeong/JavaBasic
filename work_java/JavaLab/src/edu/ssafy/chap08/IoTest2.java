package edu.ssafy.chap08;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("sample.txt");
		String str=new String("Hello");
		//파일아웃풋은 byte단위이므로 getBytes
		byte[] word=str.getBytes();
		fos.write(word);
		fos.close();
	}

}
