package com.ssafy.chap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//드라이버 클래스 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//데이터베이스로의 커넥션을 리턴한다.
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
				"ssafy","ssafy");
		Statement st=con.createStatement();
		//행렬구조를 리턴
		ResultSet rs=st.executeQuery("select * from emp");
		//다음 값 있으면 true
		StringBuilder sb= new StringBuilder();
		while(rs.next()) {
			sb.append(rs.getString("ename")+" ");
			sb.append(rs.getString("sal")+" ");
			sb.append(rs.getString("deptno")+"\n");
		}
		System.out.println(sb.toString());
		rs.close();
		st.close();
		con.close();
		
		//잘 됐는지의 유무만 리턴
		//boolean execute=st.execute("insert ");
	}

}
