package com.week1.hometask;
/*
 *  Task 7. Lift MainLift.
	����� �������, ��� ��� ���� � ���� ������������ ����� ������� ������ ����� ����.
	���� ������� Lift  �� ������ ��������.(������ ����� �����)
	�� ������ ����� ��� ����.
	����: 
 	- ������� ����
 	- ����� ���������� ������ �����������
 	- ����� ���������� ������������ �����
 	- ���������� ����� ����������� � ������ ������ � ����.
	� ����� ������: 
     - ����� ����������� ����� � ������� ����� ��� ����������� nextFloor � ����������� ������� countHuman: move(int nextFloor, int countHuman)
 	- ����� ��������� ��������� �����(�������� ���� ����� �������):printAboutMe()
	� ������� ������ ������� ������ �����, � ������� 10 ��� ����� move (� ���������� ����������) � ����� ������� ����������� �������� ����� printAboutMe.
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
