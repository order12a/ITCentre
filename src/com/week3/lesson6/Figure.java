package com.week3.lesson6;

/*
 * Polymorphysm it's a mechanism which allow
 * linked type variable have
 *  a different implementation
 */

public abstract class Figure {
	private double xPos;
	private double yPos;
	private double sideA;

	public abstract double getPerimetr();

	public double getSquare() {
		return 0;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double a) {
		sideA = a;
	}

	public Figure(double x, double y, double a) {
		xPos = x;
		yPos = y;
		sideA = a;
	}
}
