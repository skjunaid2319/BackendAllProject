package com.tw.abstaction;

public abstract class RBI {
	
	public abstract void deposit(double amount,int accountNumber);
	public abstract void withdraw(double amount,int accountNumber);
	public abstract void cheakBlance(double amount,int accountNumber);
	
	public void printSomthingComon() {
		System.out.println("Hi");
	}
}
