package week2.hometask;

import java.util.ArrayList;
import java.util.Scanner;
/*
*	 �������� ������ Car, Track, AutoSalon.
	class Car{String number; String color; Track track;}
	class Track{String number; Car car;}
	class AutoSalon{ArrayList<Car> cars;ArrayList<Track> tracks; String[] menuList;}
	class MainAutoSalon{ 
	 public static void main(String[] args){
	 AutoSalon autoSalon = new AutoSalon();
	 autoSalon.start();
	 }}
	���������� � ����������� � �����������:
	1. ���� ������ ��������� �� ������ ����, �� ������ ��� ��������� ��� ��������.
	2. ���� ������ �� ���������� � �������� ����, �� ������ ��� ��������� �� ����� ����.
	3. ������ ����������� � ����������� ������ ���� � ������ Car
	� ������ �������, ������� ������ ���� ���������, ��� ����, ����� ���� ������������ ������
	���� ��������:
	1. �������� ����� ����������
	2. �������� ����� ������
	3. ��������� � ���� ������(������ �������� ���� � ��������)
	4. ��������� �� ���� ������(������ ������� ����).
	5. ���������� ������ ����.
	6. ���������� ������ ��������.
	7. ���������� ����������� ���� �� ���������.
	8. �����
 */


public class AutoSalon {
	private ArrayList<Car> cars;
	private ArrayList<Track> tracks;
	static Scanner input = new Scanner(System.in);
	static String[] menuList ={
		"1. Add new Car ",
		"2. Add new Track ",
		"3. Fix Track with Car(enter: car index, track index) ", 
		"4. Unfix track from Car(enter car index) ",
		"5. Show List of Cars ",
		"6. Show List of Tracks ",
		"7. Show Cars fixed with Tracks ",
		"8. Exit "
	};

	public void start() {
		
		boolean runWhile = true;
		while (runWhile) {
			printMenu();
			System.out.println("�������� ��������:");
			int k = input.nextInt();
			switch (k) {
			case 1:
				System.out.println("function Add new Car");
				break;
			case 2:
				System.out.println("function Add new Track");
				break;
			case 3:
				System.out.println("function Fix Track with Car(enter: car index, track index)");
				int carIndex = input.nextInt();
				int trackIndex = input.nextInt();
				break;
			case 4:
				System.out.println("function Unfix track from Car(enter car index)");
				break;
			case 5:
				System.out.println("function Show List of Cars");
				break;
			case 6:
				System.out.println("function Show List of Tracks");
				break;
			case 7:
				System.out.println("function Show Cars fixed with Tracks");
				break;
			case 8:
				System.out.println("function Exit");
				runWhile = false;
				break;	
			}
		}
	}
	
	public static void printMenu() {
		for (String m : menuList) {
			System.out.println(m);
		}
	}
	
	public void addMewCar() {
		cars.add(new Car());
	}
	
	public void addNewTrack() {
		tracks.add(new Track());
	}
	
	public void fixTrackWithCar(int carIndex, int trackIndex) {
		
	}
}
