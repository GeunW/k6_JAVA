package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	
	public static void main(String[] args) {
		print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
		
	}

	public void print2() {
		
		int num2 = num;
		
		System.out.println("java");
		System.out.println(num2);
	}

	public static void print1() {
		StaticMethodTest exam = new StaticMethodTest();
		int num2 = exam.num;
		System.out.println("hello");
		System.out.println(exam.num);
		System.out.println(num2);
		
	}
}
