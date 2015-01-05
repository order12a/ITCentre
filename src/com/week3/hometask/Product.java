package com.week3.hometask;

public class Product {
	protected String bar;
	protected String price;
	protected String storagePeriod;
	
	public Product(String bar, String price, String storagePeriod) {
		this.bar = bar;
		this.price = price;
		this.storagePeriod = storagePeriod;
	}
	
	public void printPrice() {
		System.out.println(price);
	}
	
	public void printStoragePeriod() {
		System.out.println(storagePeriod);
	}
	
	public void printBarAndPrice() {
		System.out.println(bar + " " + price);
	}
	
}

class Fish extends Product{

	public Fish(String bar, String price, String storagePeriod) {
		super(bar, price, storagePeriod);
	}
	
	public void swim() {
		System.out.println("The fish is swimming!");
	}
	
	public void cannibalism(Fish fish) {
		System.out.println(fish.toString() + " was eated!");
	}
	
}