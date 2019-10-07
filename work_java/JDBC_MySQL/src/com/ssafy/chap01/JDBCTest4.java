package com.ssafy.chap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
				"ssafy","ssafy");
		String str="insert into customer(name,addr) values(?,?)";
		PreparedStatement st=con.prepareStatement(str);
		st.setString(1,"히뚜");
		st.setString(2, "광산구");
		boolean execute = st.execute();

		String str2="select * from customer";
		Statement st2=con.createStatement();
		ResultSet rs=st2.executeQuery(str2);
		while(rs.next()) {
			int num=rs.getInt("num");
			String name=rs.getString("name");
			String address=rs.getString("addr");
			System.out.println(num+","+name+","+address);
		}
		st.close();
		con.close();
	}

}
