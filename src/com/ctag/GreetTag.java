package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class GreetTag implements Tag {

	Tag parent;
	PageContext pageContext;

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	public PageContext getPageContext() {
		return pageContext;
	}

	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	// methods

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = getPageContext().getOut();

		try {
			out.print("GoodMorning...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE; // SKIP_PAGE
		// return SKIP_PAGE;
	}

	@Override
	public void release() {

	}

	// <table> <tr> <td>
	// <abc> <greet/> </abc>

}
