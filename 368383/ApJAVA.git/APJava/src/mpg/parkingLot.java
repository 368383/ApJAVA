package mpg;

import java.util.ArrayList;

public class parkingLot {
	private ArrayList<Car> carList = new ArrayList<Car>();
	private int location;

	public parkingLot() {

	}

	public int getLocation() {
		return location;
	}

	public static double calcAverageMPG(ArrayList<Car> carList) {
		double totalMPG = 0;
		for (Car currentCar : carList) {
			totalMPG = totalMPG + currentCar.calculateMPG();
		}
		return totalMPG / carList.size();
	}

} // hello
