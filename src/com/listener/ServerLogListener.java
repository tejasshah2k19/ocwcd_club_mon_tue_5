package com.listener;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServerLogListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("server started..... at " + new Date());
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("server shutdown....at " + new Date());
	}
}
