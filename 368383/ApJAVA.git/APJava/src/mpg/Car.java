package mpg;

public class Car {
	private int myStartMiles;
	private int myEndMiles;
	private double myGallonsUsed;

	public Car(int odometerReading) {
		myStartMiles = odometerReading;
	}

	public void fillUp(int odometerReading, double gallons) {

		myEndMiles = odometerReading - myEndMiles - myStartMiles;
		myGallonsUsed = gallons;
	}

	public double calculateMPG() {

		double mpg = myEndMiles / myGallonsUsed;
		return mpg;
	}

}
