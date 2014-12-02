package com.week1.lesson2;

public class MC2 {
	 public static void main(String[] args) {
		 Constructor car1 = new Constructor();
	  car1.number = "AA 11";
	  car1.color = "Black";

	  Constructor car2 = new Constructor("BB 234");
	  car2.color = "Red";
	  
	  Constructor car3 = new Constructor("CC 567","White");
	  
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