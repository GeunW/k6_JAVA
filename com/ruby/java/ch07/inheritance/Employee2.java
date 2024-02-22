package com.ruby.java.ch07.inheritance;

public class Employee2 extends Person2{
	private String dept;
	
	public Employee2(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return dept + "\t : " + super.toString();
	}

	
	
	
	
}
