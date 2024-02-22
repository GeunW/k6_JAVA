package com.ruby.java.ch07.추상M;

class Manager extends Employee{
	public void calcSalary(){
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
@Override
	public void calcBonus() {
	System.out.println("Manager 보너스 = 기본급*12");
		
	}
}
