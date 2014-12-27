package com.week3.lesson6;

public class Rectangle extends Figure {
	private double sideB;

	public Rectangle(double x, double y, double a, double b) {
		super(x, y, a);
		sideB = b;
	}

	@Override
	public double getPerimetr() {
		return (getSideA() + sideB) * 2;
	}

	@Override
	public double getSquare() {
		return (getSideA() * sideB);
	}
}
