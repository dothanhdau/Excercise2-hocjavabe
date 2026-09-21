package test;

import java.sql.Connection;

import com.javaweb.api.javaconnect;

public class TestJDBCconnect {
	public static void main(String[] args) {
		Connection connecion=javaconnect.getConnection();
		System.out.println(connecion);
	}
}
