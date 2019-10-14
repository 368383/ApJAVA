import java.util.Scanner;

import javax.swing.JOptionPane;

public class pigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String word1 = word;
		String clean[];
		clean = punctuation(word);
		String firstp = clean[0];
		String lastp = clean[2];
		String cword = clean[1].toLowerCase();
		String newWord = rearrange(cword);
		System.out.println("WORD " + word + "CWORD " + cword);
		String capword = cap(newWord, word1);
		System.out.println(capword);
		if (!word.equals("STOP")) {

		}
		if (clean.equals("ERROR")) {
			System.out.print("ERROR");
		} else {
			System.out.println("Your output");
			System.out.println(clean[0] + capword + clean[2]);
		}

	}

	public static String rearrange(String word) {
		String word2;
		for (int i = 0; i < (word.length() - 1); i++) {
			if ((word.charAt(0) == 'a') || (word.charAt(0) == 'e') || (word.charAt(0) == 'i') || (word.charAt(0) == 'o')
					|| (word.charAt(0) == 'u')) {
				word2 = word + "way";
				return word2;
			}
			if (word.substring(0, 2) == "qu") {
				word2 = word.substring(2, word.length()) + "quay";
				return word2;
			}
			if (word.contains("qu")) {
				word2 = word.substring(3, word.length()) + word.substring(0, 3) + "ay";
				return word2;
			} else {
				word2 = word.substring(1, word.length()) + word.substring(0, 1) + "ay";
				return word2;
			}
		}
		return "ERROR";
	}

	public static String cap(String word, String cword) {
		System.out.print("WORD" + word + "CWORD " + cword);
		if (word.substring(0, 1) == (word.substring(0, 1)).toUpperCase()) {
			System.out.print("hit");
			return cword.substring(0, 1).toUpperCase() + cword.substring(1);

		}
		return cword;
	}

	public static String[] punctuation(String word) {
		String storePunctuation = " ";
		String p[] = { "", "", "" };

		if (word.charAt(0) == '"') {
			p[0] = word.substring(0, 1);
			p[1] = word.substring(1, word.length());
		} else {
			p[0] = "";
			p[1] = word;
		}
		word = p[1];
		for (int i = 0; i < (word.length() - 1); i++) {
			if (word.charAt(i) == '.' || word.charAt(i) == '?' || word.charAt(i) == '!') {
				p[2] = word.substring(i);
				p[1] = word.substring(0, i);
			} else {
				p[2] = "";
				p[1] = word;
			}
		}
		return p;
	}
}
