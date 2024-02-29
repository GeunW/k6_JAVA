package com.ruby.java.ch14;

import java.util.function.Function;

abstract class Geomeyty2 {

	abstract double getArea();
}

class Circle2 extends Geomeyty2 {
	int radius;

	public Circle2(int radius) {

		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (double) radius * radius * Math.PI;
	}

}

class Rectangle2 extends Geomeyty2 {
	int width;
	int height;

	public Rectangle2(int width, int height) {

		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (double) width * height;
	}
}

class Triangle2 extends Geomeyty2 {
	int width;
	int height;

	public Triangle2(int width, int height) {

		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) width * height * 0.5;

	}

}

public class GeomtryTest2 {

	public static void main(String[] args) {
		Function<Geomeyty2, Double> func = (g) -> {
			return g.getArea();
		};

		System.out.println(func.apply(new Circle2(5)));

	}
}
