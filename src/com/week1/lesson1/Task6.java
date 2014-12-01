package com.week1.lesson1;

public class Task6 {
	public static void main(String [] args) {
		System.out.println(Task6.myIndexOf("My new string", "new"));
		
	}

	public static int myIndexOf(String s1, String s2) {
		int a = 0;
		if (s1.contains(s2)) {
		for (int i = 0; i < s1.length(); i++) {
			
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					a = i;
					
				}
				break;
			}
				
			} 
		}else {
			System.out.println("There is no string s2 in s1");
			return -1;
		}
		System.out.println("We have inner string s2 at position: " + a);
		return a;	
	}
}
