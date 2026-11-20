package com.abstraction.interface1;

public class MainClassPayment {
	public static void main(String[] args) {
		Payment p;
		p=new GooglePay();
		p.pay(500.0);
		
		p=new PhonePay();
		p.pay(1000.0);
		
		p=new CreditCard();
		p.pay(700.0);
	}

}
