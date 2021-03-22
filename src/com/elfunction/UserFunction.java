package com.elfunction;

import java.util.Date;

public class UserFunction {

	public static Integer nameLength(String name) {
		return name.length();

	}

	public static String greet() {

		Date d = new Date();

		int h = d.getHours();

		if (h >= 0 && h <= 11) {
			return "Good Morning";
		} else if (h >= 12 && h <= 17) {
			return "Good Noon";
		} else {
			return "Good Evening";
		}

	}

	// 2nd function

	// 3rd function

	// 4th function

}
