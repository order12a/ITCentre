package com.week4.lesson7;

public class Table extends AbstractTable implements Tablable{
	boolean dry;
	
	public void setState(boolean dry) {
		this.dry = dry;
	}

	@Override
	public void isDry() {
		System.out.println("This Table is dry - " + this.dry);
	}

	@Override
	public boolean getState() {
		return dry;
	}

}
