package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class PrintTag implements Tag {

	PageContext pageContext;
	Tag parent;

	public PageContext getPageContext() {
		return pageContext;
	}

	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	@Override
	public int doStartTag() throws JspException {
		// return SKIP_BODY;
		return EVAL_BODY_INCLUDE; // include body content
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE; // execute rest of all code on jsp
							// SKIP_PAGE --> skip rest of all code on jsp
	}

	@Override
	public void release() {

	}
}
