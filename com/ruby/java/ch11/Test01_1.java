package com.ruby.java.ch11;

public class Test01_1 {
	public static void main(String[] args) {
		
		test1();
		System.out.println("Good");
	}

	private static void test1() {
		System.out.println("test1실행");
		test2();
		System.out.println("test1종료");

	}

	private static void test2() {
		System.out.println("test2시작");
		try {
			int temp = 10/0; //ArithmeticException :산술오류
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); //NullPointerException
			int arr[] = new int[3];
			arr[3] = 30; //ArrayIndexOutOfBoundsException
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2.getMessage());
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		} 
		System.out.println("test2종료");

	}

}
