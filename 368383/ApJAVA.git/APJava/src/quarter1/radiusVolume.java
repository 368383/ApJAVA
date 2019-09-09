package quarter1;
import java.util.Scanner;


public class radiusVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		System.out.println(" Volume " + (4/(double )3) * Math.PI * Math.pow(radius, 3));
		System.out.println("Surface Area " + 4*Math.PI*Math.pow(radius,2));

	}

}
