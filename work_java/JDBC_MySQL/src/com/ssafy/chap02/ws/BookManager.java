package com.ssafy.chap02.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BookManager {

	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;
	private int cnt;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BookManager() throws SQLException {
		// TODO Auto-generated constructor stub
		con = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy",
				"ssafy");
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeStatement() {
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeResultSet() {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Book 객체 삽입
	public void insertBook(Book b) {
		String str="insert into Book(isbn,title,author,publisher,price,description) values(?,?,?,?,?,?)";
		try {
			st=con.prepareStatement(str);
			st.setString(1, b.getIsbn());
			st.setString(2, b.getTitle());
			st.setString(3, b.getAuthor());
			st.setString(4, b.getPublisher());
			st.setInt(5, b.getPrice());
			st.setString(6, b.getDescription());
			st.execute();
			System.out.println("도서 추가 완료");
			cnt++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateBook(Book b) {
		String str="update Book set title=?,author=?,publisher=?,price=?,description=? where isbn=?";
		try {
			st=con.prepareStatement(str);
			st.setString(1, b.getTitle());
			st.setString(2, b.getAuthor());
			st.setString(3, b.getPublisher());
			st.setInt(4, b.getPrice());
			st.setString(5, b.getDescription());
			st.setString(6, b.getIsbn());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteBook(String isbn) {
		String str="delete from Book where isbn=?";
		try {
			st=con.prepareStatement(str);
			st.setString(1, isbn);
			st.execute();
			System.out.println("도서 삭제 완료");
			cnt--;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Book findBook(String isbn) {
		String str="select * from Book where isbn=?";
		Book b=new Book();
		try {
			st=con.prepareStatement(str);
			st.setString(1, isbn);
			rs=st.executeQuery();
			if(rs.next()) {
				b.setIsbn(rs.getString("isbn"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setPrice(rs.getInt("price"));
				b.setDescription(rs.getString("description"));
				
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	public ArrayList<Book> listBooks(){
		String sql="select * from Book";
		ArrayList<Book> list=new ArrayList<>();
		try {
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			list=new ArrayList<>();
			while(rs.next()) {
				Book b=new Book();
				b.setIsbn(rs.getString("isbn"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setPrice(rs.getInt("price"));
				b.setDescription(rs.getString("description"));
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	//몇 개의 도서가 존재하는지
	public int count() {
		
		return cnt;
	}
}
