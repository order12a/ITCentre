package com.week1.lesson2;

import javax.sound.sampled.Line;

public class Task2 {

	public static void main(String[] args) {
		//
		String str1 = "ababacanabfffabdedab";
		String str2 = "ab";
		
		int a = Task2.matches2(str1, str2);
		
		System.out.println("Line 2 can be found in line 1: " + a + " times.");
		
	}
	
	public static int matches(String s1, String s2) {
		int a = 0;
		if (s1.contains(s2)) {
		for (int i = 0; i < s1.length(); i++) {
			
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {

					a++;
				}
			}
				
			} 
		}else {
			System.out.println("There is no string s2 in s1");
			return -1;
		}
		
		a = a / (s2.length());
		return a;
		
	}
	
	public static int matches2(String s1, String s2) {
		String buf = s1.replaceAll(s2, "_1_");
		String[] arr = buf.split("_");
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				counter++;
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("\nArr length - " + arr.length);

		
		return counter;
	}
}
