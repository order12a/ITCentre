package com.week1.lesson1;

public class Task5 {

	public static void main(String[] args){
		System.out.println("Are these strings equal: " + Task5.equals("Line1", "Line1"));
	}
	
	public static boolean equals(String line1, String line2) {
		boolean flag = true;
		try {
			for (int i = 0; i < line1.length(); i++) {
				if (line1.charAt(i) == line2.charAt(i)) {
					flag = true;
				} else {
					flag = false;
				}
			}
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
}
