package com.tw.datatype;

public class implocitdatatype {
	public static void main(String[] args) {
		
		byte byteval=127;
		short shortval=222;
		int intval=10;
		long longval=129;
		
		
		System.out.println("byteval:"+byteval);
		System.out.println("shortval:"+shortval);
		System.out.println("intval:"+intval);
		System.out.println("long:"+longval);
		
		
		long conlongval=byteval;
		int conintval=shortval;
		System.out.println("byte assing to long"+conlongval +" short assing to int "+conintval);
		
		
		
		
	 	
		
		
		        
	}
}
