package com.ssafy.chap02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
				"ssafy","ssafy");
		Statement st=con.createStatement();
		String str="create table customer(num int primary key auto_increment, name varchar(20),age int, addr varchar(1000))";
		boolean execute =st.execute(str);
		System.out.println("테이블 생성");
		st.close();
		con.close();
	}

}
