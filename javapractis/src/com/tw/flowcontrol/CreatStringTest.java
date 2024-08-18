package com.tw.flowcontrol;

public class CreatStringTest {

	public static void main(String[] args) {
		
		String str="mohammadjunaid fullstack";
		String str2="fullstack";
		
		 int length=str.length();
		 System.out.println("leght is"+length);
		 
		 
//		 Returns the char value at the specified index.
		 char ch=str.charAt(4);
		 System.out.println("character at index"+ch);
		 
		 
		 int codePoint=str.codePointAt(7);
		 System.out.println("codePoint at index"+codePoint);
		 
		 System.out.println(str.concat(str2));
		 System.out.println(str.compareTo(str2));
		 
		 System.out.println(str.contains("fullstack"));
		 
	
		

	}

}
