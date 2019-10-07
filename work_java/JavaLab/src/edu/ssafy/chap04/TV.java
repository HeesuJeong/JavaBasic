package edu.ssafy.chap04;

public class TV {
	private int isbn;
	private String name;
	private int money;
	private int stock;
	
	private int inch;
	private String dpinfo;
	
	
	public TV(int isbn, String name, int money, int stock, int inch, String dpinfo) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.money = money;
		this.stock = stock;
		this.inch = inch;
		this.dpinfo = dpinfo;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


	public String getDpinfo() {
		return dpinfo;
	}


	public void setDpinfo(String dpinfo) {
		this.dpinfo = dpinfo;
	}


	@Override
	public String toString() {
		return "TV [isbn=" + isbn + ", name=" + name + ", money=" + money + ", stock=" + stock + ", inch=" + inch
				+ ", dpinfo=" + dpinfo + "]";
	}
	
	
	
}
