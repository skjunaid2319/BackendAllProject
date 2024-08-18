package com.tw.abstaction;

public class SBI extends RBI {

	@Override
	public void deposit(double amount, int accountNumber) {
		if(accountNumber>0 && amount>0) {
			System.out.println(amount+ "amount deposit in your account");
		}
		
	}

	@Override
	public void withdraw(double amount, int accountNumber) {
		if(accountNumber>0 && amount>0) {
			System.out.println(amount+"account withdraw in your account");
		}
	}

	@Override
	public void cheakBlance(double amount, int accountNumber) {
		if(accountNumber>0 && amount>0) {
			System.out.println(amount+ "cheakBlance in your account");
		}
		

	}

}
