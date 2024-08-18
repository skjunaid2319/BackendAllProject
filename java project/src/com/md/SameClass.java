package com.md;

public class SameClass {
	
	public String p = "public Access Modifier";
	private String pr = "private Access Modifier";
	protected String pro = "protected Access Modifier";
	String d = "Default Access Modifier";
	
	void sClass() {
		
		System.out.println(p);
		System.out.println(pr);
		System.out.println(pro);
		System.out.println(d);
	}
	
	public class Subclass extends SameClass{
		void sClass() {
			
			System.out.println(p);
			System.out.println(pr);
			System.out.println(pro);
			System.out.println(d);
	}
	
	public static void main(String[] args) {
		
	}
	
	}
