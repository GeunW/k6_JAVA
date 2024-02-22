package com.ruby.java.ch07.inheritance;

public class Professor extends Person{
	private String subject;
	
	public Professor() {
		System.out.println("Professor 생성자");
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
