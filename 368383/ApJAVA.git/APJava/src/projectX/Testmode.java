package projectX;

public class Testmode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hello("alphus"));
	}

	public static String prompt(String input) {
		return design(input) + "e";
	}

	public static String process(String input) {
		return input + "b";
	}

	public static String design(String input) {
		return input + "c";
	}

	public static String hello(String alphus) {
		return prompt(alphus);
	}
}
