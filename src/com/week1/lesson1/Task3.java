package com.week1.lesson1;

import org.omg.CORBA.REBIND;

public class Task3 {
	public static void main(String [] args) {
		
		Task2 task2 = new Task2();

		System.out.println(task2.reverseString("My own String!"));
		
	}
	
	public String reverseString(String line) {

		int k = 0;
		
		for (int i = line.length() - 1 ; i >= 0; i--) {
			
			line = line.replace(line.charAt(k), line.charAt(i));
			k++;
		}
		
		return  line;
	}
}
