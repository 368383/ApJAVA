package quarter1;

import java.io.File;
import java.util.Scanner;

public class Banner {
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static String[] asciiletters = new String[183];
	public static int[] index;
	public static String[] allocation = new String[366];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		// System.out.println("TEST LINE " + asciiletters[0].trim());
		int alpha;
		String input = input();
		index = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			String enter = input.substring(i, i + 1);
			alpha = match(enter);
			index[i] = alpha;
			// System.out.println("INDEX TESTS " + alpha);
		}
		System.out.println("INDEX READ OUTS ");
		for (int ind : index) {
			System.out.println(ind);
		}

		output();

//		for (String ascii : asciiletters) {
//			System.out.println(ascii);
//		}
	}

//	public static void spacing(String ascii) {
//		int theta = ascii.length();
//		switch(theta){
//		case 
//		}
//	}

	public static int match(String input) {
		System.out.println("INPUT " + input);
		for (int l = 0; l < alphabet.length(); l++) {
			if (alphabet.substring(l, l + 1).equals(input)) {
				System.out.println("Requested letter is this index of alpahbet " + (l + 1));
				return l;
			}
		}
		System.out.println("NO VALUE DETECTED");
		return 0;
	}

	public static void output() {
		int counter = 0;
		for (int i = 0; i < 7; i++) {
			for (int ascii : index) {
				System.out.print(asciiletters[ascii * 7 + counter]);
			
			}
			System.out.println();
			counter++;
		}
	}

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String alpha = sc.next();
		return alpha;
	}

	public static void read() {
		String fileName = "ascii letters.txt";
		// TODO Auto-generated method stub

		System.out.println("Reading File from Java code");
		try {
			File file = new File(fileName);
			Scanner in = new Scanner(file).useDelimiter("\n");

			// Variable to hold the one line data
			String line;

			// Read file line by line and print on the console
			for (int i = 0; i < 183; i++) {
				String name = in.next();
				asciiletters[i] = name.replace("\n", "").replace("\r", "");;
			}
			// Close the buffer reader
			in.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}

	}
}
