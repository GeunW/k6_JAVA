package com.ruby.java.ch07.inheritance;

public class Professor2 extends Person2{
	private String subject;
	
	public Professor2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		
	}
	//overloading
	public Professor2(String name, int age) {
		super(name, age);
	}
	
		
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return subject + "\t : " + super.toString();
	}
	
	
}
