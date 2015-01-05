package week2.hometask;

import java.util.Scanner;

/*
 * Написать калькулятор (класс hw2.ConsoleCalc) в виде консольного меню
	- сложение двух чисел
	- вычитание двух чисел
	- умножение двух чисел
	- деление двух чисел
 */

public class ConsoleCalc {
	
	public static void main(String[] args) {
		calc();
	}
	
	
	public static void calc() {
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			
			printMenu();
			
			if (scan.hasNextInt()) {
				int k = scan.nextInt();
				if (k < 1 && k > 5) {
					System.out.println("Enter correct option!");
					runWhile = true;
				} else if(k == 5){
					runWhile = false;
				}else {
					System.out.println("Enter first Number");
					double num1 = scan.nextDouble();
					System.out.println("Enter second Number");
					double num2 = scan.nextDouble();
					switch (k) {
					case 1:
						if (num1 == (double)num1 && num2 == (double)num2) {
							System.out.println(num1 + num2);
						}else{
							System.out.println("Not a number was entered!");
						}
						runWhile = true;
						break;
					case 2:
						if (num1 == (double)num1 && num2 == (double)num2) {
							System.out.println(num1 - num2);
						}else{
							System.out.println("Not a number was entered!");
						}
						runWhile = true;
						break;
					case 3:
						if (num1 == (double)num1 && num2 == (double)num2) {
							System.out.println(num1 * num2);
						}else{
							System.out.println("Not a number was entered!");
						}
						runWhile = true;
						break;
					case 4:
						if (num1 == (double)num1 && num2 == (double)num2) {
							System.out.println(num1 / num2);
						}else{
							System.out.println("Not a number was entered!");
						}
						runWhile = true;
						break;	
					}
				}		
			}
			
		}		
	}
	
	public static void printMenu() {
		String[] menuList ={
			"1. Add function",
			"2. Subtract function",
			"3. Multiply function", 
			"4. Devide function",
			"5. Exit"
		};
		for (String m : menuList) {
			System.out.println(m);
		}
	}

}
