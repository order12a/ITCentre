package com.week4.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Main main = new Main();
		List<AbstractHuman> humans = main.fillHumans();
		List<AbstractTable> tables = main.createTables();
		main.takeGlasses(humans);
		for (AbstractHuman abstractHuman : humans) {
			abstractHuman.printAboutMe();
		}
		
		for (int i = 0; i < humans.size(); i++) {
			int tableNum = input.nextInt();
			humans.get(i).pourWaterOnTable(tables.get(tableNum));
		}
		
		for (AbstractTable abstractTable : tables) {

				abstractTable.isDry();				

		}
	}
	
	public List<AbstractHuman> fillHumans() {
		List<AbstractHuman> humanList = new ArrayList<>();
		int rand;
		for (int i = 0; i < 4; i++) {
			rand = (int)(Math.random()*2);
//			System.out.println(rand);
			if (rand == 1) {
				humanList.add(new HumanMan());

			} else {
				humanList.add(new HumanWoman());

			}
		}
		return humanList;
	}
	
	public void takeGlasses(List<AbstractHuman> people){
		int rand;
		for (AbstractHuman abstractHuman : people) {
			rand = (int)(Math.random()*2);
			if (rand == 1) {
				GlassCircle glassC = new GlassCircle();
				abstractHuman.takeGlass(glassC);
			} else {
				GlassSquare glassS = new GlassSquare();
				abstractHuman.takeGlass(glassS);
			}
		}
	}
	
	public List<AbstractTable> createTables() {
		List<AbstractTable> tables = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			tables.add(new Table());
		}
		
		return tables;
	}
	
}
