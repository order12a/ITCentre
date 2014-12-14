package com.week2.lesson4;

public class Car {
	private String carModel;
	private String number;
	private String color;
	private Track track;
	
	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
	
	public void unSetTrack() {
		track = null;
	}
	
	public boolean isTack() {
		if (!track.equals(null)) {
			return true;
		} else {
			return false;
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
