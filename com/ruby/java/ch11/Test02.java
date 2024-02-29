package com.ruby.java.ch11;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		test1();
		System.out.println("-".repeat(30));
		test2();
	}

	private static void test1() {
		try {
			System.out.println("1번");
			System.out.println("2번");
			System.out.println("3번");
		} catch (Exception e) {
			System.out.println("오류");
			return;
		} finally {
			System.out.println("OK");
		}
		System.out.println("4번");
	}

	private static void test2() {
		try {
			System.out.println("1번");
			String s = null;
			s.length();
			System.out.println("2번");
			System.out.println("3번");

		} catch (Exception e) {
			System.out.println("오류");
		} finally {
			System.out.println("Ok~");
		}
		System.out.println("4번");
		
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}
}
