package com.abstraction.interface1;

public class GooglePay implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment using GooglePay Rs : " +amount);

	}

}
