package com.ruby.java.ch07.추상M;

public class HRSTest{
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		Worker w = new Worker();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
		w.calcSalary();
		
		s.calcBonus();
		c.calcBonus();
		m.calcBonus();
		w.calcBonus();
		
		
		
	}
}
