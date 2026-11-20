package com.abstraction.interface1;

public class CreditCard implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Payment using CreditCard Rs : " +amount);
	}

}
