package com.week1.lesson1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String [] args) {
		String str = Task4.returnString();
		char chr = Task4.returnChar();
		System.out.println("Index of char: " + Task4.lastPlaceOfCharInString(str, chr));
	}

	
	public static String returnString() {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		return line;
	}
	
	public static char returnChar() {
		Scanner input = new Scanner(System.in);
		String ch = input.next();
		if(ch.length() > 1){
			System.out.println("Error, please enter one symbol\nIn all cases first symbol will be returned.");
		}
		char cc = ch.charAt(0);
		return cc;
	}
	
	public static int lastPlaceOfCharInString(String line, char ch) {
		int target = 0;

		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == ch)
				target = i;
		}
		return target;
	}
}
