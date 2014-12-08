package com.week2.lesson1;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		ArrayTask arrayTask = new ArrayTask();
		
		int[][] arr = arrayTask.createArray();
		
		
		try {
			if (arr.length == 0) {
				System.out.println("Bad!");
			} else {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	public int[][] createArray(){
		
		Scanner input = new Scanner(System.in);
		int  width = input.nextInt();
		int height = input.nextInt();
		int[][] array = null;
		
		
		if (width > 0 && height > 0) {
			array = new int[width][height];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = (int)(Math.random() * 10);
				}
			}
			
		}else{
			System.out.println("No minus values!");
			return array;			
		}
		return array;
	}
}
