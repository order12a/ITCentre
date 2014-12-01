package com.week1.lesson1;

import java.util.Scanner;

public class Task1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();

		String[] words = line.split("\\s+");
		System.out.println();
		
		System.out.println("Number of words: " + words.length);
		
	}
}
