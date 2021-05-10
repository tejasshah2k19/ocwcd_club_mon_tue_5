package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SelectTag extends SimpleTagSupport implements DynamicAttributes {

	// <select table="user" c1="firstName" c2="lastName" />
	String table;

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	// select c1,c2 from table;
	String colm = "";

	@Override
	public void setDynamicAttribute(String uri, String attributeName, Object value) throws JspException {

		colm = colm + value.toString() + ",";

	}

	@Override
	public void doTag() throws JspException, IOException {
		if (colm.length() >= 0) {
			System.out.println(colm);
			colm = colm.substring(0, colm.length() - 1);
		}
		
		String selectQuery = "select " + colm + " from " + table;
		getJspContext().getOut().print(selectQuery);
	}
}
