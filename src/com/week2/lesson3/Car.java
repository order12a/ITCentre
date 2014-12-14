package com.week2.lesson3;

public class Car {
	private String carModel;
	private static int count;
	
	public Car () {
		count++;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		if (carModel.equalsIgnoreCase("VW") || carModel.equalsIgnoreCase("BMW") || carModel.equalsIgnoreCase("Audi")) {
			this.carModel = carModel;
		}else{
			System.out.println("Can not set such model of Car");
		}
	}
	
	public static int getCountCars() {
		return count;
	}
	
}
