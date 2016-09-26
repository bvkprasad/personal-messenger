package com.bvkprasad.messenger.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private double id;
	private String name;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public User(double id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	
}
