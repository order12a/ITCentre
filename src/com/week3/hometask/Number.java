package com.week3.hometask;

public class Number {
	
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public double add(Number num) {
		
		return 0;
	}
	
	public double sub(Number num) {
		
		return 0;
	}
	
	public double div(Number num) {
		
		return 0;
	}
	
	public double mul(Number num) {
		
		return 0;
	}

	
	public double pow(Number exponent) {
		
		return 0;
	}
	
	public double mod(Number num) {
		double n = this.num;
		double counter = num.getNum();
		while (counter > 0) {
			n = n * this.num;
			counter--;
		}
		return n;
	}
	
	public double fact() {
		double n = 1;
		if (this.num == 0) {
			return n = 1;
		}else{
			for (int i = this.num; i > 0; i--) {
			n = n * i;					
			}
		}		
		return n;
	}
}
