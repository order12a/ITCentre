package com.week4.lesson7;

public class HumanWoman extends AbstractHuman{
	AbstractGlass glass;
	
	public HumanWoman() {
		sex = "Female";
	}

	@Override
	public void takeGlass(AbstractGlass glass) {
		this.glass = glass;
	}

	@Override
	public void putGlass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pourWaterOnTable(AbstractTable table) {
		glass.pourFromMe();
		table.setState(true);
	}

	@Override
	public void fillGlass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAboutMe() {
		System.out.println("I am - " + sex);
	}

}
