package quarter1;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> alpha = new ArrayList<Integer>();
			nextPermutation(alpha);
			System.out.println(alpha);
		}
	}

	public static ArrayList nextPermutation(ArrayList<Integer> beta) {
		while (beta.size() < 10) {
			int random = (int) (Math.random() * 10 + 1);
			if (!beta.contains(random)) {
				beta.add(random);
			}
		}
		return beta;

	}

}
