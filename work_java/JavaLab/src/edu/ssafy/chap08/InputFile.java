package edu.ssafy.chap08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputFile {
	FileReader fis;

	//생성자=> 파일리더 객체 생성하는 부분
	public InputFile(String filename) throws FileNotFoundException   {
		fis = new FileReader("data.txt");
	}

	void readLine() throws IOException  {
		String s;
		BufferedReader buf = new BufferedReader(fis);
		while ((s = buf.readLine()) != null)
			System.out.println(s);

	}

	public static void main(String[] a) {
		InputFile inputFile;
		try {
		inputFile = new InputFile("data.txt");
		inputFile.readLine();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

		//함수 내에서 try catch하면 Program End..가 안 찍혀
		System.out.println("Program End...");
	}
}
