package edu.ssafy.chap08;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoTest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("sample2.txt");
		
		//node stream에 process stream 붙여보쟈
		//모아서 쓴다 => 하나씩 쓰는 것보다 훨씬 속도 빨라진다.
		BufferedOutputStream bos =new BufferedOutputStream(fos);
		
		String s="hello heesu";
		bos.write(s.getBytes()); //byte stream을 모아서 쓰게 된다.
		
		///////////////////////////////////////////////////
		OutputStreamWriter osw =new OutputStreamWriter(fos);
		//osw.write("Hello Heesu too");
		
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("Hello HHHEEESU"); //노드스트림의 파일출력을 버퍼를 걸쳐서 하게 하는 과정
		bw.flush();
		bw.close();
		
		BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("sample2.txt")));
		bw2.write("hello ssafy hahahahha");
		bw2.flush(); //버퍼비우기
		bw2.close();
		
//		FileInputStream fis=new FileInputStream("sample2.txt");
//		InputStreamReader isr=new InputStreamReader(fis);
//		BufferedReader br=new BufferedReader(isr);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("sample2.txt")));
		String sam;
		while((sam=br.readLine())!=null) {
			System.out.println(sam);
		}
		br.close();
	}

}
