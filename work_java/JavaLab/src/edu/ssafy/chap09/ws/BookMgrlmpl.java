package edu.ssafy.chap09.ws;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class BookMgrlmpl extends Book implements IBookMgr {

	private ArrayList<Book> list;
	
	private BookMgrlmpl() {
		// TODO Auto-generated constructor stub
		list=new ArrayList<>();
	}
	
	private static BookMgrlmpl instance;
	
	public static BookMgrlmpl getInstance() {
		if(instance==null) instance=new BookMgrlmpl();
		return instance;
	}
	
	
	@Override
	public void add(Book b) throws MyException {
		// TODO Auto-generated method stub
		for(Book book:list) {
			if(book.getIsbn().equals(b.getIsbn())) {
				throw new MyException("데이터 이미 존재해요");
			}
		}
		list.add(b);
	}

	@Override
	public void update(Book b) {
		// TODO Auto-generated method stub
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getIsbn().equals(b.getIsbn())) {
				list.set(i, b);
			}
		}
	}

	@Override
	public void delete(String isbn) {
		// TODO Auto-generated method stub
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getIsbn().equals(isbn)) {
				list.remove(i);
			}
		}
	}

	@Override
	public List<Book> search(){
		// TODO Auto-generated method stub
		
		return list;
	}

	@Override
	public Book search(String isbn) throws MyException {
		// TODO Auto-generated method stub
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getIsbn().equals(isbn)) {
				return list.get(i);
			}
		}
		throw new MyException("해당 isbn 없어요.");
	}

	@Override
	public void send() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",7000);
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(s.getOutputStream()));
		oos.writeObject(list);
		oos.flush();
		//close하면 서버가 더 이상 클라이언트에게 보낼 수 없다.
		//oos.close();
	}
	
}




