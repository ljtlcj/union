package com.yx.busmis.factory;

import java.sql.Connection;
import java.sql.DriverManager;

//��ͳJDBC��ʽ����
public class ConnectionFactoryWithJDBC {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://10.1.55.128:3317/busmis","root","root");			
		return cn;
	}
}
