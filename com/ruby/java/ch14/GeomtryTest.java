package com.ruby.java.ch14;

import java.util.function.Function;

class Geomeyty {

}

class Circle extends Geomeyty {
	int radius;

	public Circle(int radius) {

		this.radius = radius;
	}

}

class Rectangle extends Geomeyty {
	int width;
	int height;

	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
	}
}

class Triangle extends Geomeyty {
	int width;
	int height;

	public Triangle(int width, int height) {

		this.width = width;
		this.height = height;
	}
}

public class GeomtryTest {

	public static void main(String[] args) {
		Function<Geomeyty, Double> func = (g) -> {
			double area = 0;
			if (g instanceof Circle) {
				Circle cir = (Circle) g;
				area = Math.PI * cir.radius * cir.radius;
			} else if (g instanceof Rectangle) {
				Rectangle rec = (Rectangle) g;
				area = rec.width * rec.height;
			} else if (g instanceof Triangle) {
				Triangle tri = (Triangle) g;
				area = 0.5 * tri.width * tri.height;
			}
			return area;
		};

		Circle cir = new Circle(5);
		double cirArea = func.apply(cir);
		System.out.println(cirArea);
		
		Rectangle rec = new Rectangle(5,5);
		double recArea = func.apply(rec);
		System.out.println(recArea);
		
		Triangle tri = new Triangle(5,6);
		double trirArea = func.apply(tri);
		System.out.println(trirArea);
	}
}
