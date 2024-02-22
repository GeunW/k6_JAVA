package com.ruby.java.ch08;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		
		inner01.a = 123;
		inner01.method2();
		
		OuterClass.Staticclass inner03 = new OuterClass.Staticclass();
		OuterClass.Staticclass.c = 789;
		OuterClass.Staticclass.method4();
		
	}
}
