package com.bvkprasad.messenger.bean;

import java.util.Date;

public class Message {

	private double id;
	private String messageBody;
	private Date date;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Message(String messageBody, Date date) {
		super();
		this.messageBody = messageBody;
		this.date = date;
	}
	
}
