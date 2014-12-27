package com.week4.lesson8;

public class Recursion {
	public static void main(String[] args) {
//		Recursion.printK(10);

//		Recursion.printKUp(20);
		
//		int c = Recursion.sumNumbers(6);
//		System.out.println(c);
		
//		System.out.println(Recursion.fibbonacci(2));
		
		System.out.println("Prime number: " + isPrime(144, 144));
	}
	
	public static void printK(int k) {
		System.out.println(k);
		if (k >2) {
			printK(k - 1);
		}
	}
	
	public static void printKUp(int k) {
		int i = 2;

		if (i <= k) {
			printKUp(k - 1);
			System.out.println(k);
		}
	}
	
	public static int  sumNumbers(int k) {
		int result;
		if (k == 1){
			return 1;
		}else{
			return result = sumNumbers(k - 1) + k;
		}
	}
	
	public static int fibbonacci(int k) {
		if (k == 0)return 0;
		if(k == 1)	return 1;
		
		return fibbonacci(k - 1) + fibbonacci(k - 2);
		
	}
	
	public static boolean isPrime(int number, int c) {
		int k = number % c;
		if (( c != number && c != 1) && k == 0) {
			System.out.println("number - " + number + " c - " + c);
			return false;
		}
		if(c == 1){
			System.out.println("number - " + number + " c - " + c);
			return true;
		}
		if (c == 0) {
			System.out.println("number - " + number + " c - " + c);
			return false;
		}
		System.out.println("number - " + number + " c - " + c);
		return isPrime(number, c - 1);	
	}
}
