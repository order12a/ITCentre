package com.week2.lesson1;

public class Phone {
	private static String[] numbers = new String[10];
	private String myNumber;
	static int counter;
	
	public Phone(String number) {
		counter++;
		myNumber = number;
		numbers[counter] = number;
	}
	
	public String getNumber() {
		return myNumber;
	}
	
	public static boolean isNumberExist(String number){
		boolean  flag = false;
		for (int i = 0; i < numbers.length; i++) {
			if (number.equalsIgnoreCase(numbers[i])) {
				flag = true;
			}
		}
		return flag;
	}
	
	public void call(String number) {
		if (isNumberExist(number)) {
			System.out.println("Number " + myNumber + " is calling number - " + number);
		}else{
			System.out.println("Sorry, there is no such number...");
		}
	}
	
	public void sendSms(String number, String text){
		if (isNumberExist(number)) {
			System.out.println("Phone " + myNumber + " texting: " + text + ", to number - " + number);
		} else {
			System.out.println("Sorry, there is no such number...");
		}
	}
}
