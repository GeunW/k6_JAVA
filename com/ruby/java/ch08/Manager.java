package com.ruby.java.ch08;

abstract class Manager extends Employee{
	public Manager() {
	System.out.println("메니저실행");
	}
	public void calcSalary(){
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}