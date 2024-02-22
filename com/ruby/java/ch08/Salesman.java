package com.ruby.java.ch08;

class Salesman extends Employee{
	public Salesman() {
	System.out.println("Salesman실행");
	}
	
	public void calcSalary(){
	System.out.println("Salseman 급여 = 기본급 + 판매 수당");
	}
	@Override
	public void calcBonus() {
		System.out.println("Salseman 보너스 = 기본급*12*4");
		
	}
}