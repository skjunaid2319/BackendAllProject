package com.tw2;

public class SameCLass {

	public String p = "Public Access Modifier";
	private String pr = "private Access Modifier";
	protected String pro = "protected Access Modifief";
	String d = "Default Access Modifier";
	
	void sClass() {
		
		
		System.out.println(p);
		System.out.println(pr);
		System.out.println(pro);
		System.out.println(d);
		
		
	}
	
	public class SubClass extends SameCLass{
		
		
		void suClass() {
			
			System.out.println(p);
			System.out.println(pr);
			System.out.println(pro);
			System.out.println(d);
		}
		
	}
	
	public static void main(String[] args) {
		
		SameCLass s = new SameCLass();
		
	}
	
}
