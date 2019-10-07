package edu.ssafy.chap07.ws;

public class Magazine extends Book{
	private int month;

	
	
	public Magazine(int isbn, String title, int price, int quantity,int month) {
		super(isbn,title,price,quantity);
		this.month = month;
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

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [month=" + month + ", isbn=" + isbn + ", title=" + title + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
	
}
