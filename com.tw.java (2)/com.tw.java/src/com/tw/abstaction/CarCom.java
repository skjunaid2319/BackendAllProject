package com.tw.abstaction;

public  class CarCom {
	
	public abstract void BMW(double amount,int accountNumber);
	public abstract void AUDI(double amount,int accountNumber);
	public abstract void INDOVAR(double amount,int accountNumber);

    public  void printSamthing() {
    	System.out.println("BMW"+"AUDI"+"INDOVAR");
    }

}
