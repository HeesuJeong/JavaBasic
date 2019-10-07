package com.ssafy.chap02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBManager {

	// 클래스변수이므로 자동으로 초기화 된다.
	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;


	public boolean insertCustomer(String name, int age, String addr) {
		
		String str="insert into customer(name,age,addr) values(?,?,?)";
		boolean res=false;
		try {
			con=ConnectionProxy.getConnection();
			st=con.prepareStatement(str);
			st.setString(1,name);
			st.setInt(2, age);
			st.setString(3, addr);
			res = st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}

	
	public boolean updateCustomer(int num, String name, int age, String addr) {
		String str="update Customer set name=?,age=?,addr=? where num=?";
		boolean res=false;
		try {
			con=ConnectionProxy.getConnection();
			st=con.prepareStatement(str);
			st.setString(1, name);
			st.setInt(2, age);
			st.setString(3, addr);
			st.setInt(4, num);
			res=st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}

	public boolean deleteCustomer(int num) {
		String str="delete from customer where num=?";
		boolean res=false;
		try {
			con=ConnectionProxy.getConnection();
			st=con.prepareStatement(str);
			st.setInt(1, num);
			res=st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	//전체조회
	public ArrayList<CustomerVO> queryCustomer() {
		String sql="select * from Customer";
		ArrayList<CustomerVO> list=new ArrayList<>();
		try {
			con=ConnectionProxy.getConnection();
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			list=new ArrayList<>();
			while(rs.next()) {
				CustomerVO vo=new CustomerVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddr(rs.getString("addr"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}
	
	//num으로 검색조회
	public CustomerVO queryCustomerByNum(int num) {
		String str="select * from customer where num=?";
		CustomerVO vo=new CustomerVO();
		try {
			con=ConnectionProxy.getConnection();
			st=con.prepareStatement(str);
			st.setInt(1, num);
			rs=st.executeQuery();
			if(rs.next()) {
			vo.setNum(rs.getInt("num"));
			vo.setName(rs.getString("name"));
			vo.setAge(rs.getInt("age"));
			vo.setAddr(rs.getString("addr"));
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
