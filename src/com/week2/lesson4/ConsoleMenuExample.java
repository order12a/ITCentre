package com.week2.lesson4;

import java.util.Scanner;

public class ConsoleMenuExample {
	 private static 
	 String[] operationNames = {"1. ������","2. ����"
	          ,"3. �����","4. �����"};
	 public static void printMenu(){
	  for(String m:operationNames) System.out.println( m );
	 }
	 public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  boolean runWhile = true;
	  while(runWhile){
	   printMenu();
	   System.out.println("�������� ��������:");
	   int k = scan.nextInt();
	   switch (k){
	    case 1:System.out.println("fucntion ������");break;
	    case 2:System.out.println("fucntion ����");break;
	    case 3:System.out.println("fucntion �����");break;
	    case 4:runWhile = false;
	   }
	  } 
	 }
	}