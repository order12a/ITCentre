package com.week1.hometask;
/*
 *  Task 7. Lift MainLift.
	Будем считать, что все люди в доме перемещаются между этажами только через лифт.
	Поля объекта Lift  не менять напрямую.(только через метод)
	На первом этаже тех этаж.
	Поля: 
 	- текущий этаж
 	- общее количество этажей перемещения
 	- общее количество перевезенных людей
 	- количество людей находящихся в данный момент в доме.
	У лифта методы: 
     - метод перемещения лифта с номером этажа для перемещения nextFloor и количеством человек countHuman: move(int nextFloor, int countHuman)
 	- метод выводящий состояние лифта(значение всех полей объекта):printAboutMe()
	В главном классе создать объект лифта, и вызвать 10 раз метод move (с рандомными значениями) и после каждого перемещения вызываем метод printAboutMe.
 */

public class MainLift {
	public static void main(String[] args) {
		Lift lift = new Lift();
		
		
		
		for (int i = 0; i < 10; i++) {
			int floor = (int)(Math.random() * 10);
			int humans = (int)(Math.random() * 10);
			System.out.println("Next floor - " + floor + " and people in lift - " + humans);
			System.out.println();
			lift.move(floor, humans);
			lift.printAboutMe();
		}
	}
}
