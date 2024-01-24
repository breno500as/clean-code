package com.br.clean.code.c03functions.employee;

public class HourlyEmployee extends Employee{

	public HourlyEmployee(String name) {
		super(name, Type.HOURLY);
	}

	@Override
	public double calculatePay() {
		return 2.0;
	}

}
