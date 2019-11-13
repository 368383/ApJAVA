package mpg;

public class Wang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car s = new Car(50);
		Car t;
		s.fillUp(250, 10);
		System.out.println(s.calculateMPG());
		t = s;
		t.fillUp(550, 10);
		System.out.println(t.calculateMPG());
		System.out.println(s.calculateMPG());
	}
}
