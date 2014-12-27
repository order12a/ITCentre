package com.week3.lesson6;

public abstract class AbstractProcessor implements Processorable {
	private int result;
	private int temp;

	@Override
	public void printResult() {
		System.out.println("Result = " + result);
	}
	
	public void printResult(char c) {
		System.out.println("Result = " + c);
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
