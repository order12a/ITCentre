package week2.hometask;

public class Track {
	private String number;
	private String state = "stopped";
	private Car car;
	
	
	public Track() {
		System.out.println("Track created");
	}
		
	public Track(String number) {
		this.number = number;
	}

	public void roll(String action) {
		if (action.equalsIgnoreCase("rolling") && state.equalsIgnoreCase("rolling")) {
			System.out.println("Track number: " + number + " can not start rolling again!");
		} else {
			System.out.println("Track number: " + number + " started rolling.");
			state = action;
		}
	}
	
	public void stop(String action) {
		if (action.equalsIgnoreCase("stopped") && state.equalsIgnoreCase("stopped")) {
			System.out.println("Track number: " + number + " can not stop again");
		} else {		
			System.out.println("Track number: " + number + " started stopped");
			state = action;
		}
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void unsetCar() {
		car = null;
	}
	
	public boolean hasCar() {
		if (!car.equals(null)) {
			return true;
		} else {
			return false;
		}
	}
}
