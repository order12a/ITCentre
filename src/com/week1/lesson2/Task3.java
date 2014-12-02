package com.week1.lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Task3 task3 = new Task3();
		System.out.println("Output: " + task3.applyCaesar("new_one", 3));
				
	}
	
	public String applyCaesar(String fileName, int shift) throws FileNotFoundException
	{
		FileReader fr = new FileReader(fileName);
		  Scanner scan = new Scanner(fr);
		  int i = 0;
		  
		  StringBuilder br = new StringBuilder();
		  
		  while (scan.hasNextLine()) {
			  String temp = scan.nextLine();
		   System.out.println("строка с номером :" + i +": " + temp);
		   br.append(temp);
		   i++;
		  }
		  
		  scan.close();
		  
		  String toCesar = br.toString();
		
	    char[] chars = toCesar.toCharArray();
	    for (int j = 0; j < toCesar.length(); j++)
	    {
	        char c = chars[j];
	        if (c >= 33 && c <= 126)
	        {
	            // Change base to make life easier, and use an
	            // int explicitly to avoid worrying... cast later
	            int x = c;
	            System.out.println("ASCI symbol of" + c + " is " + x);
	            x = x + shift;            
	            chars[j] = (char) (x);	            
	        }
	    }
	    return new String(chars);
	}

}
