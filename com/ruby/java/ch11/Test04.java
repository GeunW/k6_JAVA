package com.ruby.java.ch11;

import java.io.FileInputStream;


public class Test04 {
	
	public static void main(String[] args){
System.out.println("Start");
		try {
			test();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("End");
	}

	private static void test() throws Exception{
		FileInputStream fi = new FileInputStream("a1.txt");
		int c = fi.read();
		System.out.println((char) c);
		
	}
}
