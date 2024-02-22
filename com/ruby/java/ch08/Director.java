package com.ruby.java.ch08;

class Director extends Manager{
	public Director() {
	System.out.println("Director실행");
	}
	@Override
	public void calcBonus() {
		
		System.out.println("Director보너스 = 기본급*12*6");
	}

}
