package com.tw.JavaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Testing {

 public static void main(String[] args)   {
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employess","root","root");
		
		java.sql.Statement st =  con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp;");
		
		while (rs.next()) {
			System.out.println("emp id:" + rs.getString("id") + "emp name:" + rs.getString("name"));
		}
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	 
 }
			
	}

