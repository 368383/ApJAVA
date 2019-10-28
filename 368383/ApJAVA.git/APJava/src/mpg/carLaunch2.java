package mpg;

import java.util.ArrayList;

public class carLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> carList = new ArrayList<Car>();

		Car one = new Car(20);
		Car two = new Car(20);
		Car three = new Car(20);

		one.fillUp(300, 10);
		two.fillUp(400, 10);
		three.fillUp(500, 20);
		System.out.println(one.calculateMPG());
		System.out.println(two.calculateMPG());
		System.out.println(three.calculateMPG());

		carList.add(one);
		carList.add(two);
		carList.add(three);
		System.out.println(parkingLot.calcAverageMPG(carList));

		one.fillUp(600, 10);
		System.out.println(one.calculateMPG());

		System.out.println(parkingLot.calcAverageMPG(carList));

	}

}
