package com.tw.datatype;

public class unaryoperator {

	public static void main(String[] args) {
		int a=100;
		
		//+increment operator
		//pre-increment operator
		
//		[++,=,--,-+,!]
		
		++a;
		System.out.println("per-increment operator"+a);
		
		//++
		a++;
	    System.out.println("post-increment operator"+(a++));
	    System.out.println("post-increment operator"+a);
	    
	    //--decrement operator
	    //pre-decrement operator
	    --a;
	   
	    System.out.println("post-decrement operator"+(a--));
	    System.out.println("pre-decrement"+a);
		

	}

}
