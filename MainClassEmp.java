package com.abstraction.interface1;

public class MainClassEmp {
	public static void main(String[] args) {
		Employee e;
		e = new FullTimeEmp();
		System.out.println("FullTime employee salary : " + e.calculateSalary());

		e = new PartTimeEmp();
		System.out.println("PartTime employee salary : " + e.calculateSalary());

		e = new ContractEmp();
		System.out.println("Contract based employee salary : " + e.calculateSalary());
	}

}
