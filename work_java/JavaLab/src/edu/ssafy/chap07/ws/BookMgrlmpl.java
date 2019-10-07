package edu.ssafy.chap07.ws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BookMgrlmpl extends Book implements IBookMgr{
	private ArrayList<Book> li;
	private int index = 0;

	public BookMgrlmpl() throws ClassNotFoundException, IOException {
		li=new ArrayList<>();
		open();
	}

	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		li.add(b);
	}

	@Override
	public ArrayList<Book> searchAll() {
		// TODO Auto-generated method stub
		System.out.println("모든 도서를 출력합니다.");
		return li;
	}

	@Override
	public void sell(int isbn, int quantity) throws QuantityException, ISBNNotFoundException{
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i = 0; i < li.size(); i++) {
			cnt++;
			if(li.get(i).getIsbn()==isbn) {
				cnt--;
				int a=li.get(i).getQuantity();
				if(a-1<0) {throw new QuantityException("판매할 재고가 없습니다.");}
				li.get(i).setQuantity(li.get(i).getQuantity()-quantity);
			}
		}
		if(cnt==li.size()) throw new ISBNNotFoundException();
		
	}

	@Override
	public void buy(int isbn, int quantity) throws ISBNNotFoundException {
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i = 0; i < li.size(); i++) {
			cnt++;
			if(li.get(i).getIsbn()==isbn) {
				int a=li.get(i).getQuantity();
				li.get(i).setQuantity(li.get(i).getQuantity()+quantity);
				System.out.println("구매완료");
			}
		}
		if(cnt==li.size()) throw new ISBNNotFoundException("검색한 ISBN이 없습니다.");
	}

	@Override
	public int getTotalAmount() {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < li.size(); i++) {
			sum=li.get(i).getPrice()*li.get(i).getQuantity();
		}
		return sum;
	}

	@Override
	public void open() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream("book.dat"));
			Book c=null;
			while((c = (Book)ois.readObject()) != null) {
				li.add(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}finally {
			ois.close();
		}
		
	}

	@Override
	public void close() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois =null;
		ois=new ObjectInputStream(new FileInputStream("book.dat"));
		Book b=(Book)ois.readObject();
		ois.close();
	}

	
}
