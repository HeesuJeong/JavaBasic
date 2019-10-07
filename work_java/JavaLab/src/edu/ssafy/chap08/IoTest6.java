package edu.ssafy.chap08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class IoTest6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectInput ois =null;
		try {
			ois= new ObjectInputStream(new FileInputStream("aaa.txt"));
			Car c=(Car)ois.readObject();
			System.out.println(c.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ois.close();
		}
	}

}
