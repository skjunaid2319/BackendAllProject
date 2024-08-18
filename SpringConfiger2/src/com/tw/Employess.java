package com.tw;

public class Employess {
	
	private int id;
	private String name;
	private String emaill;
	private String mobile;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmaill() {
		return emaill;
	}
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void display() {
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Mobile :"+mobile);
		System.out.println("Email :"+email);
		
		
		
	}
	
	
	

}
