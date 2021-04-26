package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

//call all setters 
//doStartTag 
//doEndTag 
//release 

public class SqrTag implements Tag {

	PageContext pageContext;// jsp print writer ->pageContext
	Tag parent;// sqr -> <x> <sqr> </sqr> </x> ==> x Parent tag
	int num;// attribute ->setters

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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
		JspWriter out = getPageContext().getOut();

		try {
			out.print(num * num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// <sqr></sqr> --> no body content

		return SKIP_BODY; // when we dont have body content in tag we can say skip body
		// when we have body content in tag then we need to print or we need to
		// modify then we have to say return EVAL_BODY

	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public void release() {

	}
}
