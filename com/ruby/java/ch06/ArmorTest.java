package com.ruby.java.ch06;

public class ArmorTest {
	public static void main(String[] args) {
		Armor armor1 = new Armor();
		Armor armor2 = new Armor();
		Armor armor3 = new Armor();
		
		System.out.println(armor1.getName() + "  : " + armor1.getHeight());
		System.out.println(armor2.getName() + " : " + armor2.getHeight());
		System.out.println(armor3.getName() + " : " + armor3.getHeight());
		
		armor1.setName("mar6");
		armor1.setHeight(180);
		System.out.println(armor1.getName() + "  : " + armor1.getHeight());
		
		armor2.setName("mar16");
		armor2.setHeight(220);
		System.out.println(armor2.getName() + " : " + armor2.getHeight());
		
		armor3 = null;
		armor3.setName("mar38");
		armor3.setHeight(200);
		System.out.println(armor3.getName() + " : " + armor3.getHeight());
	}
}
