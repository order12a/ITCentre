package com.week4.lesson7;

public abstract class AbstractTable implements Tablable{
	public abstract void setState(boolean dry);
	
	public abstract boolean getState();
}
