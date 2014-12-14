package com.week2.lesson3;

public class MainCar {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setCarModel("BMW");
		System.out.println(car.getCarModel());
		Car car1 = new Car();
		car1.setCarModel("Audi");
		Car car2 = new Car();
		car2.setCarModel("VW");
		car.setCarModel("bla-bla-bla");
		
		System.out.println("Total count of cars: " + Car.getCountCars());
	}
}
