package com.tw.datatype;

public class Test2 {
	
	
	int a=20;
	int b=30;
	int c=40;
	
	
	public static String str;
	
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		t1.calci(t1.a, t1.b, t1.c);
	  
	}

	private void calci(int a2, int b2, int c2) {
		// TODO Auto-generated method stub
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		
		c2 = a2 + b2;
		System.out.println("Addition:"+c2);
		
		c2 = a2 -b2;
		System.out.println(c2);
		
		c2 = a2 *b2;
		System.out.println(c2);
		
	}

}
