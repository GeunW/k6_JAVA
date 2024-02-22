package com.ruby.java.ch07.inheritance;

public class LMSTest2 {
	public static void main(String[] args) {
		
		Professor2 p = new Professor2("홍길동",52,"IT");
		Employee2 e = new Employee2("크로롱",120,"행정");
		Student2 s = new Student2("피카츄",12,"전기");
		Professor2 p2 = new Professor2("고길동",99);
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(s.toString());
		System.out.println(p2.toString());
		
	}
}
