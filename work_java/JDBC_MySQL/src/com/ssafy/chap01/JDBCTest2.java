package com.ssafy.chap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResultSet rs=null;
		Connection con=null;
		PreparedStatement pst=null;
		//1.Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Connection 연결
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
						"ssafy","ssafy");
			//3.Query 작성
			String sql="select * from emp where sal > ? and deptno = ? and ename = ?";
			pst=con.prepareStatement(sql);
			
			//물음표 수에 일치하게 set해줘야 한다.
			
			//첫번째 물음표에 2000을 넣는다
			pst.setInt(1, 2000);
			//두번째 물음표에 10번부서를 넣는다
			pst.setInt(2, 10);
			pst.setString(3, "king");
			
			//4.Query 실행
			rs=pst.executeQuery();
			
			//5.결과값 가져오기
			StringBuilder sb= new StringBuilder();
			while(rs.next()) {
				sb.append(rs.getString("ename")+" ");
				sb.append(rs.getString("sal")+" ");
				sb.append(rs.getString("deptno")+"\n");
			}
			System.out.println(sb.toString());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.close하기
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
