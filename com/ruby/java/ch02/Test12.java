package com.ruby.java.ch02;

public class Test12 {

	public static void main(String[] args) {
		int a = 017;
		int b = 0xf;
		System.out.println("a = " + a + "\t b = " + b);
		
		String hexa = Integer.toHexString(b);
		System.out.println("hexa = " + hexa);
		
	}

}
