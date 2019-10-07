package edu.ssafy.chap06.hw;

public interface IProductMgr {
	void add(Product p);

	void searchAll();

	void searchLsbn(int a);

	void searchName(String n);

	void searchTV();

	void searchRefrigerator();

	void search50Inch();

	void update(int n, int p);

	void delProduct(int n);

	void totalMoney();
}
