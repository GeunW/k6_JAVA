package com.ruby.java.ch11;

public class Test01 {
	
	
	
	public static void main(String[] args) {
		try {
			
			String s = new String("java");
			int len = s.length();
			s=null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2.getMessage());
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("GOOD");
	}
}
