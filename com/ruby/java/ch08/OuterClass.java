package com.ruby.java.ch08;

public class OuterClass {
	class InstanceClass{
		int a;
		void method2() {
			System.out.println("Instance Class : " + a);
		}
	}
	
	static class Staticclass{
		int b;
		static int c;
		void method3() {
			System.out.println("Static class : "+b);
			
		}
		static void method4() {
			System.out.println("Static class : "+c);
		}
	}
	
}
