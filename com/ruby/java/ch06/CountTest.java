package com.ruby.java.ch06;

class Count { //default 클래스
	public static int totalCount; // 공유
	int count;
}

public class CountTest {
	public static void main(String[] args) {
		System.out.println("실행 시작");
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;
		Count.totalCount++;
		System.out.println(Count.totalCount +" : "+c1.count);
		c2.count++;
		Count.totalCount++;
		System.out.println(Count.totalCount +" : "+c2.count);
		c3.count++;
		Count.totalCount++;
		System.out.println(Count.totalCount +" : "+c3.count);
		System.out.println("-----------------------------------------------------");
		
		System.out.println(Count.totalCount +" : "+c1.count);
		System.out.println(Count.totalCount +" : "+c2.count);
		System.out.println(Count.totalCount +" : "+c3.count);
		System.out.println("-----------------------------------------------------");
		c1.totalCount++;
		System.out.println(Count.totalCount +" : "+c1.count);
		
	}
}

