package com.week2.lesson3;

/*
 *  ������ �������: 
 	������� ����� Phone � ������:
 	static String[] numbers, String myNumber
 	��� �������� ������ �������-��������, �� �������� � ���� ������� numbers. 
 	c ��������: 
 	- isNumberExist(String number) - ��������� ������� �������� � ����
 	- call(String number) - ������� �� ����� "������� �����-�� ������ ������-��"
 	- sendSms(String number, String text) - ������� �� ����� ��������� � ���� �����������
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
