package week2.hometask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
*	 Ќаписать классы Car, Track, AutoSalon.
	class Car{String number; String color; Track track;}
	class Track{String number; Car car;}
	class AutoSalon{ArrayList<Car> cars;ArrayList<Track> tracks; String[] menuList;}
	class MainAutoSalon{ 
	 public static void main(String[] args){
	 AutoSalon autoSalon = new AutoSalon();
	 autoSalon.start();
	 }}
	“ребованию к закреплению и откреплению:
	1. ≈сли прицеп закреплен за другим авто, то нельз€ его закрепить дл€ текущего.
	2. ≈сли прицеп не прикреплен к текущему авто, то нельз€ его открепить от этого авто.
	3. ћетоды закреплени€ и откреплени€ должны быть в классе Car
	и другие правила, которые должны быть соблюдены, дл€ того, чтобы была корректность ссылок
	ћеню операций:
	1. ƒобавить новый автомобиль
	2. ƒобавить новый прицеп
	3. «акрепить к авто прицеп(запрос индексов авто и прицепов)
	4. ќткрепить от авто прицеп(запрос индекса авто).
	5. ќтобразить список авто.
	6. ќтобразить список прицепов.
	7. ќтобразить закреплени€ авто за прицепами.
	8. ¬ыход
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

	public void start() throws IOException {
		
		cars = new ArrayList<>();
		tracks = new ArrayList<>();
		
		boolean runWhile = true;
		while (runWhile) {
			Runtime.getRuntime().exec("cls");
			printMenu();
			System.out.println("¬ыберите операцию:");
			int k = input.nextInt();
			switch (k) {
			case 1:
				System.out.println("function Add new Car");
				addNewCar();
				runWhile = true;
				break;
			case 2:
				System.out.println("function Add new Track");
				addNewTrack();
				runWhile = true;
				break;
			case 3:
				System.out.println("function Fix Track with Car(enter: car index, track index)");
				int carIndex = input.nextInt();
				int trackIndex = input.nextInt();
				fixTrackWithCar(carIndex, trackIndex);
				runWhile = true;
				break;
			case 4:
				System.out.println("function Unfix track from Car(enter car index)");
				int carIndex2 = input.nextInt();
				unfixTrackFromCar(carIndex2);
				runWhile = true;
				break;
			case 5:
				System.out.println("function Show List of Cars");
				showListOfCars();
				runWhile = true;
				break;
			case 6:
				System.out.println("function Show List of Tracks");
				showCarsWithTracks();
				runWhile = true;
				break;
			case 7:
				System.out.println("function Show Cars fixed with Tracks");
				showCarsWithTracks();
				runWhile = true;
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
	
	public void addNewCar() {
		cars.add(new Car("BMW", "AA4354CC", "red"));
	}
	
	public void addNewTrack() {
		Track tr = new Track();
		tracks.add(tr);
	}
	
	public void fixTrackWithCar(int carIndex, int trackIndex) {
		
		if (carIndex >= cars.size() && trackIndex >= tracks.size()) {
			if (!cars.get(carIndex).hasTack() || !tracks.get(trackIndex).hasCar()) {
				cars.get(carIndex).setTrack(tracks.get(trackIndex));
				tracks.get(trackIndex).setCar(cars.get(carIndex));
			} else {
				System.out.println("Can\'t fix track to this car, track has already been fixed to this/other car.");
			}
		} else {
			System.out.println("Index of car/track not allowed!");
		}
	}
	
	public void unfixTrackFromCar(int carIndex) {
		if (carIndex >= cars.size()) {
			if (cars.get(carIndex).hasTack()) {
				cars.get(carIndex).unSetTrack();
				cars.get(carIndex).getTrack().unsetCar();
			} else {
				System.out.println("Can\'t unfix track from this car, it could be already unfixed.");
			}
		} else {
			System.out.println("Index of car not allowed!");
		}
	}
	
	public void showListOfCars() {
		for (Car car : cars) {
			System.out.println("Car - " + car.toString() + ", with index - " + cars.indexOf(car));
		}
	}
	
	public void showListOfTracks() {
		for (Track track : tracks) {
			System.out.println("Track - " + track.toString() + ", with index - " + tracks.indexOf(track));
		}
	}
	
	public void showCarsWithTracks() {
		for (Car car : cars) {
			if (car.hasTack()) {
				System.out.println("Car - " + car.toString() + ", with index - " + cars.indexOf(car) + ", with track - " + 
			car.getTrack().toString() + ", with index -" + tracks.indexOf(car.getTrack()));
			}
		}
	}
}
