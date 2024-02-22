package com.ruby.java.ch02;

public class Test16 {

	public static void main(String[] args) {
		byte a = 23;
		int b = a;
		//a = b;
		byte i = 10;
		byte j = 20;
		//byte k = i + j; //덧셈 연산자는 int타입 기준으로 정의
		byte k = (byte)(i + j);
		System.out.println(k);
	}

}
