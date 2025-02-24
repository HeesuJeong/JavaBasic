package edu.ssafy.chap04;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc){
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.desc=desc;
	}
	
	public String toString() {
		String str=String.format("%13s|%13s|%13s|%13s|%13d|%13s", isbn,title,author,publisher,price,desc);
		return str;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
