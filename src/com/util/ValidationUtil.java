package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Jap Purohit&  
//Tejas Shah&


public class ValidationUtil {
	public static boolean emailCheck(String email) {

		String regex = "^[a-zA-Z0-9]+@[A-Za-z0-9]+\\.[a-zA-Z]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean ans = m.matches();
		if (ans == false) {
			System.out.println("invalid");
		} else {
			System.out.println("valid");
		}
		return ans;
	}

	public static void printName(String line) {
		String regExFirstName = "[A-Z][a-z]+";
		Pattern p = Pattern.compile(regExFirstName);
		Matcher m = p.matcher(line);
		
		while(m.find()) {//
			System.out.print(m.start()+"-"+m.end()+"=>");
			System.out.println(m.group());//Jap Purohit 
			
		}
	}
	
	public static void main(String[] args) {
	//	emailCheck("aaa@gmail.aaa");
		printName("Jap Purohit%%% This is The Jap is my name and  Purohit is My Surname");
		
	}
}
