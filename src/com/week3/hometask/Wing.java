package com.week3.hometask;

public class Wing {
	private int fuelCapacity;
	
	public Wing() {
	}
	
	public Wing(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
}

class Plane extends Wing{
	private Wing wing1;
	private Wing wing2;
	private int coordinates[][];
	
	public Plane(int fuelCapacity) {
		wing1 = new Wing(fuelCapacity/2);
		wing2 = new Wing(fuelCapacity/2);
	}
	
	public void takeOff() {
		if (wing1.getFuelCapacity() > 1 && wing2.getFuelCapacity() > 1) {
			System.out.println("Taking land off");
		} else {
			System.out.println();
		}
	}
	
	public void selectRoute(int[][] coordinates) {
		this.coordinates = coordinates;
	}
	
	public void printRoute() {
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = 0; j < coordinates[i].length; j++) {
				System.out.print(coordinates[i][j]);
			}
			System.out.println();
		}
	}
}
