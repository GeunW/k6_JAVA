package com.ruby.java.ch08;

public class HRSTest{
	public static void calcTax(Employee e) {
		e.calcSalary();
		
		if(e instanceof Salesman)
			System.out.println("Salesman"+((Salesman)e).annual_sales);
		else if(e instanceof Manager)
			System.out.println("Manager"+e.annual_sales);
		else if(e instanceof Employee)
			System.out.println("Manager"+e.annual_sales);
		
	}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Employee e = new Salesman();
		Director d = new Director();
		Object s3 = new Salesman();
		
		
		calcTax(s);
		calcTax(e);
		calcTax(d);
		calcTax(s3);
		
		
		
		
		
		
	}
}
