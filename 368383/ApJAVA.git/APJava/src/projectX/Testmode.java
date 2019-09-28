package projectX;

public class Testmode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prompt(var(), what()));
	}

	public static String var() {
		return "alphus";
	}

	public static String prompt(String input, boolean alphus) {
		if (alphus == true) {
			return design(input) + "e";
		}
		return "false";
	}

	public static String process(String input) {
		return input + "b";
	}

	public static String design(String input) {
		return input + "c";
	}

	public static boolean what() {

		return false;
	}
}
