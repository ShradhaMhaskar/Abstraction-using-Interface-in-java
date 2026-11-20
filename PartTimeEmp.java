package com.abstraction.interface1;

public class PartTimeEmp implements Employee{
	@Override
	public double calculateSalary() {
		int hour=100;
		int hourlyRate=200;
		return hour*hourlyRate;
	}

}
