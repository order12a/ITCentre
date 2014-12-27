package com.week4.lesson7;

public class GlassSquare extends AbstractGlass implements Glassable{
	
	public GlassSquare() {
		glassType = " Square Glass ";
	}

	@Override
	public void pourFromMe() {
		System.out.println("I am Square Glass, I am pouring!");
	}

	@Override
	public String getGlassType() {
		return glassType;
	}

}
