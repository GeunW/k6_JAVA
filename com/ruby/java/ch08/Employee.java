package com.ruby.java.ch08;

abstract class Employee {
	public Employee() {
	System.out.println("Employee실행");
	}
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

