package com.week2.lesson4;

public class DivInitial {
	int p;
	{
		p = 10;
		System.out.println("���� �������������1");
	}
	{
		p = 20;
		System.out.println("���� �������������2");
		f();
	}

	static {
		System.out.println("static ���� �������������");
		// f();
	}

	public DivInitial() {
		System.out.println("�����������");
	}

	public static void main() {
		System.out.println("k");
	}

	public void f() {
		System.out.println("Instance method");
	}
}
