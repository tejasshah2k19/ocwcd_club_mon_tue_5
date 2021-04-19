package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SumTag extends SimpleTagSupport implements DynamicAttributes {

	int sum = 0;

	@Override
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();

		out.print("Sum  = " + sum);
	}

	@Override
	public void setDynamicAttribute(String uri, String attributeName, Object attributeValue) throws JspException {

		sum = sum + Integer.parseInt(attributeValue + "");
	}
}
