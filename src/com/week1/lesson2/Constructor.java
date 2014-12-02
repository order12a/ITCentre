package com.week1.lesson2;

public class Constructor {
	String number;
	String color;
	String state = "stopped";

	public void printAboutMe() {
		System.out.println("Я авто с номером " + number + " и цветом " + color);
	}

	public Constructor() {

	}

	public Constructor(String n) {
		number = n;
	}

	public Constructor(String number, String c) {
		this.number = number;
		color = c;
	}
	
	public void start() {
		if (!state.equals("started") && !state.equals("moving")) {
			System.out.println("Starting the car");
			state = "started";
		} else {
			System.out.println("Car is already started or moving");
		}
	}
	
	public void move() {
		
		if (!state.equals("stopped")) {
			System.out.println("Moving somewhere");
			state = "moving";
		} else {
			System.out.println("Can not move until started");
		}
	}
	
	public void stop() {
		if (!state.equals("stopped") && !state.equals("started")) {
			System.out.println("Car stopped!");
			state = "stopped";
		}else{
			System.out.println("Can not stop.");
		}
	}
}