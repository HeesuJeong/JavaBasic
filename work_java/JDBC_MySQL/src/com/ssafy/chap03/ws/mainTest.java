package com.ssafy.chap03.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mainTest {

	static Connection con=null;
	static PreparedStatement st=null;
	static ResultSet rs=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy",
					"ssafy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//1. 테이블에 정보 입력
		insertAuthor(1, "정희수", "50366805");
		insertAuthor(2, "김태희", "12345678");
		insertAuthor(3, "김태희", "99999999");
		insertBook("1111","ddu","dduwabduwari",10000,"good",1);
		insertBook("2222","minnaldo","soccer",20000,"nice",2);
		//insertBook("3333","JG","next",20000,"smile",3);
		
		
		//2. author 테이블 수정
		updateTable();
		
		// author와 book 테이블 출력
		listBooks();
		listAuthor();
		
		//3. Join
		System.out.println("Book과 Author 테이블을 JOIN하여 도서명, 가격, 저자명을 검색하세요");
		join();
		System.out.println();
		
		//4.
		System.out.println(" 이름이 ‘김태희’인 저자의 도서명, isbn, 출판사를 출력하세요.");
		findBook();
		System.out.println();
		
		//5.
		System.out.println("author 테이블에 있는 저자명 별로 출간된 도서들을 도서명, 출판사,\r\n" + 
				"가격, 저자명을 출력하라");
		groupbyAuthor();
		System.out.println();
		
		
	}

	static public void groupbyAuthor() {
		String str="select b.title,b.publisher,b.price,a.name from book as b, author as a where a.authorno=b.authorno group by a.name;";
		try {
			st=con.prepareStatement(str);
			rs=st.executeQuery();
			while(rs.next()) {
				System.out.printf("[title:%s, publisher:%s, price:%d, name:%s]\n",
						rs.getString("title"),rs.getString("publisher"),rs.getInt("price"),rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static public void findBook() {
		String str="select b.title, b.isbn, b.publisher, a.name from book as b, author as a where a.authorno=b.authorno and a.name='김태희'";
		try {
			st=con.prepareStatement(str);
			rs=st.executeQuery();
			while(rs.next()) {
				System.out.printf("[title:%s, isbn:%s, publisher:%s, name:%s]\n",
						rs.getString("title"),rs.getString("isbn"),rs.getString("publisher"),rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static public void join() {
		String str="select b.title, b.price, a.name from book as b, author as a where b.authorno=a.authorno";
		try {
			st=con.prepareStatement(str);
			rs=st.executeQuery();
			while(rs.next()) {
				System.out.printf("[title:%s, price:%d, name:%s]\n",
						rs.getString("title"),rs.getInt("price"),rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static public void listBooks(){
		String sql="select * from Book";
		try {
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				System.out.printf("[isbn:%s, title:%s, publisher:%s, price:%d, description:%s, authorno:%d]\n",
						rs.getString("isbn"),rs.getString("title"),rs.getString("publisher"),rs.getInt("price"),rs.getString("description"),rs.getInt("authorno"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static public void listAuthor(){
		String sql="select * from Author";
		try {
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				System.out.printf("[authorno:%d, name:%s, phone:%s]\n",
						rs.getInt("authorno"),rs.getString("name"),rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void insertBook(String isbn, String title, String publisher, int price, String description, int authorno) {
		String str="insert into Book(isbn,title,publisher,price,description,authorno) values(?,?,?,?,?,?)";
		try {
			st=con.prepareStatement(str);
			st.setString(1, isbn);
			st.setString(2, title);
			st.setString(3, publisher);
			st.setInt(4, price);
			st.setString(5, description);
			st.setInt(6, authorno);
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void insertAuthor(int authorno, String name, String phone) {
		String str="insert into Author(authorno,name,phone) values(?,?,?)";
		try {
			st=con.prepareStatement(str);
			st.setInt(1,authorno);
			st.setString(2, name);
			st.setString(3, phone);
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void updateTable() {
		String str="alter table author add(test int)";
		try {
			st=con.prepareStatement(str);
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
