package edu.ssafy.chap07.ws;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class makeDat extends Book{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Book[] b=new Book[10];
		b[0]=new Book(1234,"first",10000,10);
		b[1]=new Book(4534,"second",20000,20);
		b[2]=new Book(8838,"third",13000,5);
		b[3]=new Book(1234,"fourth",40000,10);
		b[4]=new Book(8495,"fifth",50000,100);
		b[5]=new Magazine(1234,"first",10000,10,5);
		b[6]=new Magazine(4534,"second",20000,20,7);
		b[7]=new Magazine(8838,"third",13000,5,7);
		b[8]=new Magazine(1234,"fourth",40000,10,10);
		b[9]=new Magazine(8495,"fifth",50000,100,5);
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		fos=new FileOutputStream("book.dat");
		oos=new ObjectOutputStream(fos);
		for (int i = 0; i < 10; i++) {
			oos.writeObject(b[i]);
		}
		oos.close();
		fos.close();
	}

}
