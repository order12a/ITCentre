package com.week1.lesson1;

import java.util.Scanner;
/*
вводит с консоли целое число и выводит на экран 
удвоенное 
 */
public class Task2a {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int m = scan.nextInt();
  double n = scan.nextDouble();
  Object obj = scan.next();
  
  System.out.println(obj);
  int resultat = m * 2;
  System.out.println(resultat);
 }
}