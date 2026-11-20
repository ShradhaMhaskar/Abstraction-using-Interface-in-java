package com.abstraction.interface1;

public class PhonePay implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Payment using PhonePay Rs : " +amount);
	}

}
