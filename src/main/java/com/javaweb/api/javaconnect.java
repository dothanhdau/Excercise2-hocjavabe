package com.javaweb.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class javaconnect {
	public static Connection getConnection(){
		Connection c =null;
		try {
			// đăng kí mysql với mysql manager
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/estatebasic";
            String user = "root";
            String pass = "An191106";
            // tạo kết nối
            c=DriverManager.getConnection(url, user, pass);
            System.out.println("ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
