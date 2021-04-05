package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CurrencyTag extends SimpleTagSupport{

	String type;
	float amount;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		if(type.toLowerCase().equals("usd")) {
			out.print( (amount/75)+"$");//75 -- dynamic 
		}else if(type.toLowerCase().equals("gbp")) {
			out.print( (amount/85)+"&#163");
		}else {
			out.print("Invalid Currency Format");
		}
		
		
	}
}







