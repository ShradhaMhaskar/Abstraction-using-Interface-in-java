package com.abstraction.interface1;

public class MainClassVehical {
	public static void main(String[] args) {
		Vehical v;
		v = new Car();
		v.start();
		v.stop();

		v = new Bike();
		v.start();
		v.stop();

		v = new Bus();
		v.start();
		v.stop();
	}

}
