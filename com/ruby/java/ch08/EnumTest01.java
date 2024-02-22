package com.ruby.java.ch08;

enum Status{
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest01 {	
	public static void main(String[] args) {
		Status work =null;
		int n =2;
		switch(n) {
		case 1:
			work = Status.READY;
			System.out.println("READY");
			break;
		case 2:
			work = Status.SEND;
			System.out.println("SEND");
			break;
		case 3:
			work = Status.COMPLETE;
			System.out.println("COMPLETE");
			break;
		case 4:
			work = Status.CLOSE;
			System.out.println("CLOSE");
			break;
		
		}
	}
}
