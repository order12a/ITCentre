package com.week3.hometask;

public class Cat extends Animal{
	private boolean feded = false;

	public Cat(String name) {
		super(name);
	}
	
	public void say() {
		System.out.println("Meow-meow-meow!");
	}
	
	public void riseHair() {
		System.out.println("Hair is rised!");
	}
	
	public void eat() {
		feded = true;
	}
	
	public void yellIfNotGorged() {
		if (!feded) {
			System.out.println("MEEEOWWW!!!");
		}
	}
}
