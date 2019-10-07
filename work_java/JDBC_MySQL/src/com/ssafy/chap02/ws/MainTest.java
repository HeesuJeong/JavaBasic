package com.ssafy.chap02.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class MainTest {

	int menu;
	Scanner s;
	BookManager man;

	public MainTest() throws SQLException {
		// TODO Auto-generated constructor stub
		s = new Scanner(System.in);
		man = new BookManager();
	}

	private void go() {
		
		while (true) {
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.전체 목록 검색 6.종료 7.도서 개수 출력");
			menu = s.nextInt();
			switch (menu) {
			case 1:
				insert();
				printAllBooks();
				break;
			case 2:
				update();
				printAllBooks();
				break;
			case 3:
				delete();
				printAllBooks();
				break;
			case 4:
				search();
				break;
			case 5:
				printAllBooks();
				break;
			case 6:
				close();
				break;
			case 7:
				count();
				break;
			}
		}
	}
	
	private void count() {
		// TODO Auto-generated method stub
		System.out.println("도서의 총 개수는 "+man.count()+"입니다.");
	}

	private void close() {
		// TODO Auto-generated method stub
		man.closeConnection();
		man.closeResultSet();
		man.closeStatement();
		System.exit(0);
	}

	private void search() {
		// TODO Auto-generated method stub
		System.out.println("검색할 번호를 입력하세요");
		String isbn=s.next();
		Book b=man.findBook(isbn);
		System.out.println(b.toString());
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 번호를 입력하세요");
		String isbn=s.next();
		man.deleteBook(isbn);
	}

	private void update() {
		// TODO Auto-generated method stub
		Book b=new Book();
		System.out.println("업뎃할 isbn를 입력하세요");
		b.setIsbn(s.next());
		System.out.println("업뎃할 title를 입력하세요");
		b.setTitle(s.next());
		System.out.println("업뎃할 author를 입력하세요");
		b.setAuthor(s.next());
		System.out.println("업뎃할 publisher를 입력하세요");
		b.setPublisher(s.next());
		System.out.println("업뎃할 price를 입력하세요");
		b.setPrice(s.nextInt());
		System.out.println("업뎃할 description를 입력하세요");
		b.setDescription(s.next());
		man.updateBook(b);
		
	}

	private void printAllBooks() {
		// TODO Auto-generated method stub
		ArrayList<Book> list=man.listBooks();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		Book b=new Book();
		System.out.println("추가할 isbn를 입력하세요");
		b.setIsbn(s.next());
		System.out.println("추가할 title를 입력하세요");
		b.setTitle(s.next());
		System.out.println("추가할 author를 입력하세요");
		b.setAuthor(s.next());
		System.out.println("추가할 publisher를 입력하세요");
		b.setPublisher(s.next());
		System.out.println("추가할 price를 입력하세요");
		b.setPrice(s.nextInt());
		System.out.println("추가할 description를 입력하세요");
		b.setDescription(s.next());
		man.insertBook(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new MainTest().go();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
