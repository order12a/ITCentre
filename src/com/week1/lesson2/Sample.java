package com.week1.lesson2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Sample {
 public static void main(String[] args) throws Exception{

  FileWriter fw = new FileWriter("file1.txt");
  fw.write("stroka 1\n");// \n \r\n
  fw.write("stroka 2");
  fw.flush();
  fw.close();
/*  

  FileReader fr = new FileReader("file1.txt");
  Scanner scan = new Scanner(fr);
  int i = 0;
  while (scan.hasNextLine()) {
   System.out.println("������ � ������� :" + i+": " + scan.nextLine());
  }
  scan.close();
*/  
 }
}