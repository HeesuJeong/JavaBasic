package com.ssafy.chap02;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DispatcherConsole {

	int menu;
	Scanner s;
	DBManager man;

	public DispatcherConsole() throws SQLException {
		// TODO Auto-generated constructor stub
		s = new Scanner(System.in);
		man = new DBManager();
	}

	private void go() {
		
		while (true) {
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.검색 6.종료 ");
			menu = s.nextInt();
			switch (menu) {
			case 1:
				insert();
				list();
				break;
			case 2:
				update();
				list();
				break;
			case 3:
				delete();
				list();
				break;
			case 4:
				list();
				break;
			case 5:
				search();
				list();
				break;
			case 6:
				man.close();
				System.exit(0);
				break;

			}
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		System.out.println("추가할 이름를 입력하세요");
		String name=s.next();
		System.out.println("추가할 나이를 입력하세요");
		int age=s.nextInt();
		System.out.println("추가할 주소를 입력하세요");
		String addr=s.next();
		man.insertCustomer(name, age, addr);
	}

	private void update() {
		// TODO Auto-generated method stub
		System.out.println("업뎃할 번호를 입력하세요");
		int num=s.nextInt();
		System.out.println("업뎃할 이름를 입력하세요");
		String name=s.next();
		System.out.println("업뎃할 나이를 입력하세요");
		int age=s.nextInt();
		System.out.println("업뎃할 주소를 입력하세요");
		String addr=s.next();
		man.updateCustomer(num, name, age, addr);
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 번호를 입력하세요");
		int num=s.nextInt();
		man.deleteCustomer(num);
	}

	private void list() {
		// TODO Auto-generated method stub
		ArrayList<CustomerVO> list=man.queryCustomer();
		for (CustomerVO vo : list) {
			System.out.println(vo);
		}
	}

	private void search() {
		// TODO Auto-generated method stub
		System.out.println("검색할 번호를 입력하세요");
		int num=s.nextInt();
		CustomerVO c=man.queryCustomerByNum(num);
		System.out.println(c.toString());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new DispatcherConsole().go();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
