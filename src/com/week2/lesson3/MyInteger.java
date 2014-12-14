package com.week2.lesson3;

public class MyInteger {
	
	private int value;
		

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int plus(MyInteger myInteger) {
		int result = value + myInteger.getValue();
		return result;
	}
}
