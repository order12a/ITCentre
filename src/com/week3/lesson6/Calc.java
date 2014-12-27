package com.week3.lesson6;

public class Calc {
	AbstractProcessor proc;

	public Calc(AbstractProcessor pr) {
		proc = pr;
	}

	public void inSymv(char c) {
		proc.inputChar(c);
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '=') {
			proc.printResult(c);
		}else{
			proc.printResult();
		}
//		String s = Character.toString(c);
//		int x = Integer.parseInt(s);

	}
}