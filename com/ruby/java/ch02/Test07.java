package com.ruby.java.ch02;

public class Test07 {

	public static void main(String[] args) {
		int a = 10;
		int b,c = 0;
		b = ++a;
		c = a++;
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		boolean result = b == c;
		System.out.println("result = " + result);
		
		short e = -10;
		int f = -e;
		System.out.println(e);
		System.out.println(f);
		
		boolean isOn = true;
		while(!isOn) {
			System.out.println("!!");
		}
	}

}
