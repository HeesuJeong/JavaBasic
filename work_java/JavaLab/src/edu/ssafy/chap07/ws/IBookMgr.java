package edu.ssafy.chap07.ws;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface IBookMgr {
	void add(Book b);
	ArrayList<Book> searchAll();
	void sell(int isbn, int quantity) throws QuantityException, ISBNNotFoundException;
	void buy(int isbn, int quantity) throws ISBNNotFoundException;
	int getTotalAmount();
	void open()throws ClassNotFoundException, IOException;
	void close() throws FileNotFoundException, IOException, ClassNotFoundException;
}
