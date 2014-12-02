package com.week1.lesson2;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "red";
		car1.number = "XM4455VV";
		Car car2 = new Car();
		car2.color = "green";
		car2.number = "XM4422DV";
		Car car3 = new Car();
		car3.color = "black";
		car3.number = "XM4335ZZ";
		
		car1.printAboutMe();
		car2.printAboutMe();
		car3.printAboutMe();
	}
}
