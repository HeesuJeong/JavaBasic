package edu.ssafy.chap09.ws;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;

public class BookTest {

	private BookMgrlmpl mgr;
	private Scanner scan;
	private int menu;

	public BookTest() {
		mgr = BookMgrlmpl.getInstance();
		scan = new Scanner(System.in);
	}

	public void go() {
		while (true) {
			System.out.println("번호를 입력하세요 \n1.입력,2.조회,3.send");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("isbn title price를 입력하세요");
				try {
					mgr.add(new Book(scan.next(), scan.next(), scan.nextInt()));
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				List<Book> search = mgr.search();
				print(search);
				break;
			case 3:
				try {
					mgr.send();
					System.out.println("서버로 전송성공");
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}

	public void print(List<Book> li) {
		for (Book b : li)
			System.out.println(b.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookTest().go();
	}

}
