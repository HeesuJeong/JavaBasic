package edu.ssafy.chap07.ws;

import java.io.Serializable;

public class Book implements Serializable {
	protected int isbn;
	protected String title;
	protected int price;
	protected int quantity;
	
	public Book() {}
	
	public Book(int isbn, String title, int price, int quantity) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
