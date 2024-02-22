package com.ruby.java.ch05;

public class Armor{
	public static void main(String[] args) {
		
		System.out.println("1");
		String num = takeoff(1,2);
		System.out.println("2");
		System.out.println(num);
		System.out.println("3");
		
	}

	static String takeoff(int A, int B) {
		System.out.println("take off");
		return A +" ===> "+ B;
	}
}
