package com.ruby.java.ch07.inheritance;

public class Student2 extends Person2{
	private String major;
	
	public Student2(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return major + "\t : " + super.toString();
	}
	
	
	
}
