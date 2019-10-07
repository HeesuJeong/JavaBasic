package edu.ssafy.chap07.ws;

import java.io.IOException;
import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) throws ClassNotFoundException, QuantityException, ISBNNotFoundException, IOException {
		// TODO Auto-generated method stub
		BookMgrlmpl b = new BookMgrlmpl();
		ArrayList<Book> tmp = new ArrayList<Book>();

		// 모든 도서 출력
		tmp = b.searchAll();
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}

		// 검색한 ISBN이 없는 경우
		try {
			b.sell(1, 1);
		} catch (ISBNNotFoundException e) {
			e.printStackTrace();
		}
		// 재고 없는 경우
		try {
			b.sell(1234, 1);
		} catch (QuantityException e) {
			e.showError();
		}
		//구매에서 해당 ISBN없는경우
		try {
			b.sell(1, 1);
		} catch (ISBNNotFoundException e) {
			e.showError();
		}
		//구매 오케이
		try {
			b.buy(4534, 20);
		} catch (ISBNNotFoundException e) {
			e.showError();
		}
		System.out.println("구매 후 목록입니다.");
		tmp = b.searchAll();
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}
		//재고도서의 수량*금액 총액
		System.out.println("모든 재고 도서의 수량*금액 입니다 : "+b.getTotalAmount());
		
		try {
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// main

}
