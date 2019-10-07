package edu.ssafy.chap06.ws;

public interface IBookMgr {
	void add(Book b);
	void searchAll();
	void searchLsbn(int a);
	void searchTitle(String title);
	void searchBook();
	void searchMagazine();
	void searchThisYearM();
	void searchPublisher(String p);
	void searchPrice(int p);
	void totalMoney();
	void Average();
}
