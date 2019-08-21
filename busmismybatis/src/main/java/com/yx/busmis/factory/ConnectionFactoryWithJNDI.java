package com.yx.busmis.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactoryWithJNDI {
	private static ComboPooledDataSource ds=null;
	
	static {
		try {
			Context ctx=new InitialContext();
			ds= (ComboPooledDataSource) ctx.lookup("ds");
			ctx.close();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
	public static ComboPooledDataSource getDataSource() throws Exception{
		return ds;
	}
}
