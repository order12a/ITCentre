package com.week3.lesson6;

public class Samsung extends Phone{
	
	public Samsung(boolean touch, boolean camera, int sideSize, String model,
			String number) {
		super(touch, camera, sideSize, model, number);
	}
	
	public Samsung(String model, String number, int sideSize){
		super();
		this.model = model;
		this.number = number;
		this.sideSize = sideSize;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String getNumber() {
		return number;
	}
	
}
