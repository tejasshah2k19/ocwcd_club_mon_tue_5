package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCounter implements HttpSessionListener {
	static int userCounter = 0;

	// create
	public void sessionCreated(HttpSessionEvent arg0) {
		userCounter++;
		System.out.println("User In : " + userCounter);
	}

	// logout timeout
	public void sessionDestroyed(HttpSessionEvent arg0) {
		userCounter--;
		System.out.println("User Out : " + userCounter);
	}

}
