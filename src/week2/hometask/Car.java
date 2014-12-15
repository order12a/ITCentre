package week2.hometask;

public class Car {
	private String carModel;
	private String number;
	private String color;
	private Track track;
	private static int count;	
	
	public Car () {
		count++;
	}
	
	public Car(String carModel, String number, String color) {
		this.carModel = carModel;
		this.number = number;
		this.color = color;
		System.out.println("Params: " + carModel + " " + number + " " + color);
		count++;
	}

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
	
	public void unSetTrack() {
		track = null;
	}
	
	public boolean hasTack() {
		if (!track.equals(null)) {
			return true;
		} else {
			return false;
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	


	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		if (carModel.equalsIgnoreCase("VW") || carModel.equalsIgnoreCase("BMW") || carModel.equalsIgnoreCase("Audi")) {
			this.carModel = carModel;
		}else{
			System.out.println("Can not set such model of Car");
		}
	}
	
	public static int getCountCars() {
		return count;
	}
	
}
