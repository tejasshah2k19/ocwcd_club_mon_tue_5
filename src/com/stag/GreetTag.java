package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {
		Date d = new Date();
		int h = d.getHours();
		if (h >= 12 && h <= 18) {
			getJspContext().getOut().print("Good AfterNoon");
		}

		if (h > 18 && h < 24) {
			getJspContext().getOut().print("Good Evening...");
		}

	}

}

//
//public class GreetTag implements SimpleTag{
//
//	@Override
//	public void doTag() throws JspException, IOException {
//
//		System.out.println(".........hello.....");
//	}
//
//	@Override
//	public JspTag getParent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void setJspBody(JspFragment arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setJspContext(JspContext arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setParent(JspTag arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
