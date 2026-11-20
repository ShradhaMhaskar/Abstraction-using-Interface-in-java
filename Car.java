package com.abstraction.interface1;

public class Car implements Vehical {
	@Override
	public void start() {
		System.out.println("Car is starting...");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped");
		System.out.println("");

	}

}
