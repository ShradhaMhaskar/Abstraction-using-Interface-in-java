package com.abstraction.interface1;

public class Bus implements Vehical {
	@Override
	public void start() {
		System.out.println("Bus is starting...");
	}

	@Override
	public void stop() {
		System.out.println("Bus is stopping");
		System.out.println("");
	}

}
