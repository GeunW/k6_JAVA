package com.ruby.java.ch07.추상M;

public class Worker extends Employee{

	@Override
	public void calcSalary() {
		System.out.println("Worker 급여 = 기본급");
		
	}
	@Override
	public void calcBonus() {
		System.out.println("Worker 보너스 = 기본급*1");
		
	}
	
}
