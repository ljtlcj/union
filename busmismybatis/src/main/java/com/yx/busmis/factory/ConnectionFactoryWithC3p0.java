package com.yx.busmis.factory;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactoryWithC3p0 {
	
	public static ComboPooledDataSource cpds=null;
	
	static {
		
		  cpds = new ComboPooledDataSource();
		
		try {
			cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://10.1.53.22:3317/busmis?serverTimezone=GMT%2B8");		
			cpds.setUser("root");
			cpds.setPassword("root");
			
			cpds.setInitialPoolSize(1);
			cpds.setMaxPoolSize(2);
			 
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	
	public static Connection getConnection() throws Exception{
		return cpds.getConnection();
	}
	

}
