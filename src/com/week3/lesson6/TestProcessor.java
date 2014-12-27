package com.week3.lesson6;

public class TestProcessor extends AbstractProcessor {

	@Override
	public void inputChar(char c) {
		System.out.println(c);
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '=') {
			setResult(getResult());
		} else {
			String s = Character.toString(c);
			int x = Integer.parseInt(s);
			setResult(getResult() + x);
		}

	}
}
