package edu.ssafy.chap08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("hello.txt");
		
		
		//byte로 읽어보쟈 1바이트 처리 => 더 빠르다
		//파일 못 찾는 경우 위해 예외처리 throws
		FileInputStream fis=new FileInputStream(f);
		int a=0;
		
		//EOF이 -1
		while((a=fis.read())!=-1) {
			System.out.println((char)a);
		}
		
		System.out.println("================");
		//char 즉 2바이트 처리
		FileReader fr=new FileReader(f);
		while((a=fr.read())!=-1) {
			System.out.print((char)a);
		}
		fis.close();
		fr.close();
		
	}

}
