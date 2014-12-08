package com.week1.hometask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Task4.
 * 1) �������� �����, ������� � �������� ��������� ��������� ��� �����.
 * ����� ���������� ���������� ������ (String): ����� ���������� � ��������.

 * � ����� ����� ���������� ������� ���:
 * ;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
 * ���������� �� ������ 10
 */

public class ParseValues {

	public static void main(String[] args) throws FileNotFoundException {
		String[][] pairs = ParseValues.parseData("data.txt");
		for (int i = 0; i < pairs.length; i++) {
			
				System.out.print(pairs[i][0] + "   ");
				

		}
		
		System.out.println();
		
		for (int i = 0; i < pairs.length; i++) {
			System.out.print(pairs[i][1] + "   ");
		}
		
	}

	public static String[][] parseData(String fileName)
			throws FileNotFoundException {

		String[][] parsedData = new String[10][2];

		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		StringBuilder builder = new StringBuilder();

		while (scan.hasNextLine()) {
			
			builder = builder.append(scan.nextLine());
		}
		scan.close();
//		String 
		
//		for (int i = 0; i < parsedData[i].length; i++) {
//			while (scan.hasNextLine()) {
//				scan.useDelimiter(";");
//				String line = scan.nextLine();
//				String[] dataPair = line.split("=");
//
//				for (int j = 0; j < parsedData[j].length; j++) {
//					System.out.println("Data = " + dataPair[j]);
//					parsedData[i][j] = dataPair[j];
//				}
//
//			}
//		}

//		scan.close();
		String[][] targetArr = new String[10][2];
		String result = builder.toString();
		String[] arr = result.split(";");
//		System.out.println(arr[0] + " " +  arr[1] +" " +  arr[2]);
		
		for (int i = 0; i < arr.length; i++) {
			String[] newArr = arr[i].split("=");
//			System.out.println(newArr[0] + " " + newArr[1]);
			if (newArr[0] == null) {
				break;
			}else{
				targetArr[i][0] = newArr[0];
			}
			
			if (newArr[1].equals(null)) {
				break;
			} else {
				targetArr[i][1] = newArr[1];
			}
			
			
			
//			System.out.println(targetArr[i][0] + " " + targetArr[i][1]);
		}
		
		return targetArr;
	}
}
