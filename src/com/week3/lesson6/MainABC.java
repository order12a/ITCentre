package com.week3.lesson6;

public class MainABC {
	public static class A {
	}

	public static class B extends A {
	}

	public static class C extends B {
	}

	public static void main(String[] args) {
		A obj = new B();

		if (obj instanceof A)
			System.out.println("A");
		if (obj instanceof B)
			System.out.println("B");
		if (obj instanceof C)
			System.out.println("C");
	}
}
