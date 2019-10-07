package edu.ssafy.chap09.ws;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public interface IBookMgr {
	void add(Book b) throws MyException;
	void update(Book b);
	void delete(String isbn);
	List<Book> search();
	Book search(String isbn) throws MyException;
	void send() throws UnknownHostException, IOException ;
}
