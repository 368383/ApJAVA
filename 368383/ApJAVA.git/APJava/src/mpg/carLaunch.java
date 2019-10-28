package mpg;

public class carLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car testCar = new Car(15);

		testCar.fillUp(250, 10);
		System.out.println(testCar.calculateMPG());
		
		testCar.fillUp(455, 12.5);
		System.out.println(testCar.calculateMPG());

	}

}
