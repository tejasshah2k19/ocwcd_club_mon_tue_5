package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TodayTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		Date d = new Date();

		int day = d.getDay();//
		System.out.println("Todays number => " + day);
		if (day == 0) {
			out.print("Today is Sunday");
		} else if (day == 1) {
			out.print("Today is Monday");
		} else if (day == 3) {
			out.print("Today is Wed");
		} else {
			out.print("Today is tue or thus or fri or sat");
		}
	}
}
