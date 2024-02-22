package com.ruby.java.ch05;

class T {
	
	private String name = "홍길동";
	private int height = 180;
	private int weight = 100;
	 String color = "Red";
	
	 @SuppressWarnings("unused")
	 private void takeOff() {
		System.out.println("Take Off");
	}
	@SuppressWarnings("unused")
	private void land() {
		System.out.println("Land");
	}
	@SuppressWarnings("unused")
	private void shootLaser() {
		System.out.println("Shoot Laser");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
	
public class ArmorTest {
	public static void main(String[] args) {

		T armor = new T();
		String name = armor.getName();
		System.out.println(name);
		
		
	}
}
