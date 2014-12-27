package com.week4.lesson7;

public class GlassCircle extends AbstractGlass{
	
	public GlassCircle() {
		glassType = " Circle Glass ";
	}
	
	public String getGlassType() {
		return glassType;
	}

	@Override
	public void pourFromMe() {
		System.out.println("I am Circle Glass, I am pouring!");
	}

}
