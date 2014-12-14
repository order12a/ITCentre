package com.week2.lesson3;

/*
 *  Задача Телефон: 
 	создать класс Phone с полями:
 	static String[] numbers, String myNumber
 	при создании нового объекта-телефона, он вносится в базу номеров numbers. 
 	c методами: 
 	- isNumberExist(String number) - проверяет наличие телефона в базе
 	- call(String number) - выводит на экран "телефон такой-то звонит такому-то"
 	- sendSms(String number, String text) - выводит на экран сообщение и кому адрессовано
 */

public class Task2 {
	
	public static void main(String[] args) {
		Phone phone1 = new Phone("1111");
		Phone phone2 = new Phone("424234");
		Phone phone3 = new Phone("23253e");
		Phone phone4 = new Phone("22213");
		Phone phone5 = new Phone("33335");
		
		phone1.call("22213");
		phone2.sendSms("1111", "MY TEXT");
		phone3.call("ewnfenvru");
	}
}
