package com.week3.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {
	
	static Scanner input;
	
	public static void main(String[] args) {
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		Phone nokia = new Nokia(false, true, 3, "3301", readNumber());
		phoneList.add(nokia);
		
		Phone samsung = new Samsung(true, true, 5, "S3", readNumber());
		phoneList.add(samsung);
		
		phoneList.get(0).call(readNumber());
		phoneList.get(1).call(phoneList.get(0).getNumber());
		
		Phone iPhone4 = new IPhone4(true, true, 4, "iPhone4", readNumber(), "IA44SS66");
		phoneList.add(iPhone4);
		System.out.println(phoneList.get(2).getModel());
		
		Phone iPhone5 = new IPhone5(true, true, 4, "iPhone5", readNumber(), "SS3453KK88HH22");
		phoneList.add(iPhone5);
		IPhone ph = (IPhone)phoneList.get(3);
		System.out.println(ph.getAppleID());
		
		System.out.println();
//		phoneList.add(new Nokia("3344", readNumber(), 2));
		
		for (Phone phone : phoneList) {
			System.out.println(phone.getModel());
			if (phone instanceof IPhone) {
				IPhone iPh = (IPhone)phone;
				System.out.println("Apple ID: " + iPh.getAppleID());
			}
		}
	}
	

	public static String readNumber(){
		input = new Scanner(System.in);
		String number = input.nextLine();
		return number;
	}
}
