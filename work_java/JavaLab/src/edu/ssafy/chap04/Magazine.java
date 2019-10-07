package edu.ssafy.chap04;

public class Magazine {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;
	
	public Magazine(String isbn, String title, String author, String publisher,int year,int month, int price, String desc){
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		if(year<2000||year>2100) {System.out.println("year 범위 초과 입니다. 재입력하세요.");}
		else{this.year=year;}
		if(month<=0||month>13) {System.out.println("month 범위 초과 입니다. 재입력하세요.");}
		else {this.month=month;}
		this.price=price;
		this.desc=desc;
	}
	
	public String toString() {
		String day=year+"."+month;
		String str=String.format("%13s|%13s|%13s|%13s|%13d|%13s|%13s", isbn,title,author,publisher,price,desc,day);
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<2000||year>2100) {System.out.println("year 범위 초과 입니다. 재입력하세요.");}
		else{this.year=0;}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0||month>13) {System.out.println("month 범위 초과 입니다. 재입력하세요.");}
		else {this.month=0;}
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
