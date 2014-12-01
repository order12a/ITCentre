package com.week1.lesson1;

import org.omg.CORBA.REBIND;

public class Task2 {
	public static void main(String [] args) {
		
		Task2 task2 = new Task2();

		System.out.println(task2.reverseString("My own String!"));
		
	}
	
	public String reverseString(String line) {

		String revStr = "";
		
		for (int i = line.length() - 1 ; i >= 0; i--) {
			revStr = revStr + line.charAt(i);
		}
		
		return  revStr;
	}
}
