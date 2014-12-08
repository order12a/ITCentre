package com.week1.hometask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Task4.
 * 1) Написать метод, который в качестве параметра принимает имя файла.
 * Метод возвращает двухмерный массив (String): имена переменных и значение.

 * В файле набор переменных указаны так:
 * ;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
 * Переменных не больше 10
 */

public class ParseValues {

	public static void main(String[] args) throws FileNotFoundException {
		String[][] pairs = ParseValues.parseData("data.txt");
		for (int i = 0; i < pairs.length; i++) {
			for (int j = 0; j < pairs[i].length; j++) {
				System.out.println(pairs[i][j]);
			}
		}
		System.out.println();
	}

	public static String[][] parseData(String fileName)
			throws FileNotFoundException {

		String[][] parsedData = new String[10][2];

		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);

		for (int i = 0; i < parsedData[i].length; i++) {
			while (scan.hasNextLine()) {
				scan.useDelimiter(";");
				String line = scan.nextLine();
				String[] dataPair = line.split("=");

				for (int j = 0; j < parsedData[j].length; j++) {
					System.out.println("Data = " + dataPair[j]);
					parsedData[i][j] = dataPair[j];
				}

			}
		}

		scan.close();

		return parsedData;
	}
}
