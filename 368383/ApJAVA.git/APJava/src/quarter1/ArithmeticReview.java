package quarter1;
//Jonathan Young, 9/5/19, APJava, Period 1
public class ArithmeticReview {
	public static void main(String[] args) {
		//integer task 1
		int firstNumber = 9;
		int secondNumber = 8;
		
		System.out.println("9+8=17 "+(firstNumber+secondNumber));
		System.out.println("9-8=1 "+(firstNumber-secondNumber));
		System.out.println("9x8=72 "+(firstNumber*secondNumber));
		System.out.println("9/8=1 "+(firstNumber/secondNumber));
		System.out.println("9%8=1 "+(firstNumber%secondNumber));
		System.out.println("");

		//OUTPUT
//				9+8=17 17
//				9-8=1 1
//				9x8=72 72
//				9/8=1 1
//				9%8=1 1

		//double task 2
		double firNumber;
		double secNumber;
//		System.out.println("Value of firNumber "+ firNumber);
//		System.out.println("");
//		System.out.println("Value of secNumber "+ secNumber);
//		System.out.println("");
		// default value for double is null
		firNumber = 9.4;
		secNumber = 8.2;	
		System.out.println("9.4+8.2=17.6 "+(firNumber+secNumber));
		System.out.println("9.4-8.2=1.2"+(firNumber-secNumber));
		System.out.println("9.4*8.2=77.08 "+(firNumber*secNumber));
		System.out.println("9.4/8.2=1.1463414634146343 "+(firNumber/secNumber));
		System.out.println("9.4/8.2=1.2"+(firNumber%secNumber));
		System.out.println("");

		//OUTPUT
//				9.4+8.2=17.6 17.6
//				9.4-8.2=11.200000000000001
//				9.4*8.2=77.08 77.08
//				9.4/8.2=1.15 1.1463414634146343
//				9.4/8.2=1 1.200000000000001

		boolean first;
		boolean second; 
//		System.out.println("boolean first value "+ first);
//		System.out.println("boolean second value "+ second);
		//boolean default values are null 
		
	first = true; 
	second = false; 
	System.out.println("AND value " + (first&second));
	System.out.println("OR value " + (first||second));
	System.out.println("AND NOT value " + !(first&second));
	System.out.println("");


//OUTPUT
//	AND value false
//	OR value true
//	AND NOT value true

	}
}
