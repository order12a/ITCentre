package com.week3.lesson6;

public abstract class Phone {
	
	private boolean touch;
	private boolean camera;
	protected int sideSize;
	protected String model;
	protected String number;
	
	public Phone(boolean touch, boolean camera, int sideSize, String model, String number) {
		this.touch = touch;
		this.camera = camera;
		this.sideSize = sideSize;
		this.model = model;
		this.number = number;
	}
		
	public Phone() {
		touch = false;
	}

	public abstract String getModel();
	
	public abstract void setNumber(String number);
	
	public abstract String getNumber();
	
	public void call(String number) {
		System.out.println("Phone " + getModel() + " with number " + this.number + " is calling number - " + number);
	}
}
