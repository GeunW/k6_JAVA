package com.ruby.java.ch07.추상M;

class Consultant extends Employee{
	public void calcSalary(){
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급*12*4");
		
	}
}