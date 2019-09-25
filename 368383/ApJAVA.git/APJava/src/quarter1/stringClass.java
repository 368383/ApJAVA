package quarter1;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		System.out.println("Jonathan Young");
		// 2
		String one = "one";
		String two = new String("two");
		// 3
		System.out.println(one);
		System.out.println(two);
		// 4
		one = "four";
		// 5
		System.out.print("\n");
		// 6
		System.out.println("one length" + one.length());
		System.out.println("two length" + two.length());
		// 7
		System.out.print("\n");
		// 8
		System.out.println("one third char " + one.charAt(2));
		System.out.println("two third char " + two.charAt(2));
		// 9
		System.out.print("\n");
		// 10
		one = one.toUpperCase();
		// 11
		System.out.println(one);
		// 12
		System.out.print("\n");
		// 13
		two = two + "ing";
		// 14
		System.out.println(two);
		// 15
		System.out.print("\n");
		//16
		System.out.println(two);
		System.out.println(one);

		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(one));
		//17
		System.out.print("\n");
		//18
		System.out.println(one.equals(two));
		//19
		System.out.print("\n");
		//20
		one = "hello";
		two = "hello";
		System.out.println(one.compareTo(two));
	}

}
