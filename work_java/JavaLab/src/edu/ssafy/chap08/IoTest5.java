package edu.ssafy.chap08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoTest5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Car c=new Car("111",10000);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("aaa.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			oos.close();
			fos.close();
		}
	}

}
