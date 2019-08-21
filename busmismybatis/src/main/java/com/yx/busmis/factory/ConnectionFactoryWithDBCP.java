package com.yx.busmis.factory;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;


public class ConnectionFactoryWithDBCP {
	
	private static DataSource ds=null;
	
	static {
		BasicDataSource bds = new BasicDataSource(); 
		bds.setDriverClassName("com.mysql.jdbc.Driver");  
        bds.setUsername("root");  
        bds.setPassword("root");  
        
        bds.setUrl("jdbc:mysql://10.1.55.128:3317/busmis?serverTimezone=GMT%2B8");  
        bds.setInitialSize(1);  
        bds.setMaxTotal(2);  
        bds.setMaxIdle(2);  
        bds.setMaxWaitMillis(2000);  
        ds=bds;
	}
	
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
	}
}
