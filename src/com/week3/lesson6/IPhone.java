package com.week3.lesson6;

public class IPhone extends Phone{
	protected String appleID;

	public IPhone(boolean touch, boolean camera, int sideSize, String model, String number, String appleID) {
		super(touch, camera, sideSize, model, number);
		this.appleID = appleID;
	}

	@Override
	public String getModel() {		
		return model;
	}
	
	public String getAppleID() {
		return appleID;
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
