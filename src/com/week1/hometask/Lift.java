package com.week1.hometask;

public class Lift {
	int currentFloor = 0;
	int minFloor = 0;
	int maxFloor = 10;
	int totalNumberOfFloorsMoved = 0;
	int countOfMovedPeople = 0;
	int totalNumberOfPeople = 200;
	int liftCapacity = 10;
	public int counterTillRepair = 0;
		
	public void move(int nextFloor, int countHuman) {	
			
		if (countHuman <= liftCapacity) {
			
			if (currentFloor == 0 && nextFloor != 0 && counterTillRepair < 1000) {
				totalNumberOfPeople = totalNumberOfPeople + countHuman;				
			}
			
			if (counterTillRepair < 1000) {				
				if (nextFloor != currentFloor) {			
					
					if (currentFloor < nextFloor) {						
						countOfMovedPeople = countOfMovedPeople + countHuman;
						counterTillRepair++;
						totalNumberOfFloorsMoved = totalNumberOfFloorsMoved + (nextFloor - currentFloor);
						currentFloor = nextFloor;
					} else {
						countOfMovedPeople = countOfMovedPeople + countHuman;
						counterTillRepair++;
						totalNumberOfFloorsMoved = totalNumberOfFloorsMoved + (currentFloor - nextFloor);
						currentFloor = nextFloor;
					}
					
				} else {
					counterTillRepair = counterTillRepair;
				}
			} else {
				System.out.println("Need repair!");
			}
			
			if (currentFloor == 0 && counterTillRepair < 1000) {
				totalNumberOfPeople = totalNumberOfPeople - countHuman;
			}
		}else{
			counterTillRepair = counterTillRepair;
			currentFloor = currentFloor;
			System.out.println("Lift capacity exceeded!");
		}
	}
	
	public void printAboutMe() {
		System.out.println("Current floor: " + currentFloor);
		System.out.println("Total number of Floors moved: " + totalNumberOfFloorsMoved);
		System.out.println("Count of moved people: " + countOfMovedPeople);
		System.out.println("Total number of people: " + totalNumberOfPeople);
		System.out.println("Counter till repair - " + counterTillRepair);
		System.out.println();
	}
}
