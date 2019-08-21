package com.yx.busmis.listener;


import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yx.busmis.factory.ConnectionFactoryWithC3p0;
import com.yx.busmis.factory.ConnectionFactoryWithJNDI;



/**
 * Application Lifecycle Listener implementation class ServerStartUpListen
 *
 */
@WebListener
public class ServerStartUpListen implements ServletContextListener {



	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	try {
    		
    		System.out.println("服务器启动............");
    		/*
    		Context ctx= new InitialContext();	
    		System.out.println("11............");

    		ComboPooledDataSource ds= ConnectionFactoryWithJNDI.getDataSource();
    		if(ds.equals(null)) {
        		System.out.println("null............");

    		}else {
        		System.out.println("not null............");

    		}
    		System.out.println("22............");

    		ctx.bind("ds", ds);
    		
    		System.out.println("33............");

    		ctx.close();
    		System.out.println("44............");*/

		} catch (Exception e) {
			System.out.println("服务器启动失败............");
			e.printStackTrace();
			// TODO: handle exception
		}
    	
    }
	
}




