package com.week1.lesson2;

public class MainCar2 {
	 public static void main(String[] args) {
		 CarWithConstructor car1 = new CarWithConstructor();
	  car1.number = "AA 11";
	  car1.color = "Black";

	  CarWithConstructor car2 = new CarWithConstructor("BB 234");
	  car2.color = "Red";
	  
	  CarWithConstructor car3 = new CarWithConstructor("CC 567","White");
	  
	  car1.printAboutMe();
	  car2.printAboutMe();
	  car3.printAboutMe();
	  
	  car1.start();
	  car2.start();
	  car3.start();
	  
	  car1.move();
	  car2.move();
	  
	  car1.stop();
	  car2.stop();
	  car3.stop();
	 }
	}