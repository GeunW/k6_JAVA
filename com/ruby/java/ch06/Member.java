package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// ---------------------------------------------------------
	
	public Member() {
		//System.out.println("Member() 생성자 실행");
		this("guest");
	}
	
	public Member(String name) {
		this(name,0);
	}
	

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
//		System.out.println("msin() 메서드 실행");
//		Member mem = new Member();
//		mem.setName("홍길동");
//		
//		System.out.println(mem);
		
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy",23);
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
		System.out.println("m3:"+m3);
		
	}
}
