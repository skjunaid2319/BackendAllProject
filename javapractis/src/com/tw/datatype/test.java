package com.tw.datatype;


public class test{
public static void main(String[]args) {
   

       byte byteval=127;
       short shortval=222;
       int intval=10;
	   long longval=29;
	   
	   
	   System.out.println("byteval:"+byteval);
	   System.out.println("shortval:"+shortval);
	   System.out.println("intval"+intval);
	   System.out.println("longval:"+longval);
     
     
     long conlongval=byteval;
     int conintval=intval;
     System.out.println("byte assing to long "+conlongval+ " short assing to int "+conintval);
     
     
     byteval=(byte) longval;
     System.out.println(byteval);
      
     shortval= (short) longval;
     System.out.println(shortval);  
     
     intval=(int) longval;
     System.out.println(intval);
     
     byteval=(byte) intval;
     System.out.println(byteval);
     
     
     
     
     
     
     
}
}

