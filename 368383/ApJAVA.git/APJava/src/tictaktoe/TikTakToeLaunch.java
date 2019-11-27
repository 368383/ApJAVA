package tictaktoe;

import bankPart2.Utility;

public class TikTakToeLaunch {
	public static int round = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (random() == 1) {
			System.out.println("Human Input");
			humanPlay();
		} else {
			System.out.println("Computer Input");
			computerPlay();
		}

	}

	public static int random() {
		int alpha = (int) (Math.random() * 2 + 1);
		System.out.println(alpha);
		return alpha;
	}

	public static void humanPlay() {
		System.out.println(
				"To choose slot, insert value from 1 to 9 when prompted | To input, insert either X or an O (not case sensitive)");
		Game play = new Game();

		String input = null;
		int slot = 0;
		while (round <= 8) {
			Display.print();
			humanInput(play, round);
			round++;
		}
	}

	public static void computerPlay() {
		System.out.println(
				"To choose slot, insert value from 1 to 9 when prompted | To input, insert either X or an O (not case sensitive)");

		Game play = new Game();

		String input = null;
		int slot = 0;
		while (round <= 8) {
			System.out.println("=========NEXT ROUND=======");
			Display.print();
			computerInput(play, round);

			round++;
		}

	}

	private static void humanInput(Game play, int round) {
		String input;
		int slot;
		slot = play.setSlot();
		input = play.setInput();
		play.input(slot, input);
		if (round == 0) {
			play.startingCondition();
		}
		Display.print();
		System.out.println("COMPUTERS TURN");
		play.determineSlots();
		play.calculation();
	}

	private static void computerInput(Game play, int round) {
		System.out.println("COMPUTERS TURN");
		if (round == 0) {
			play.startingCondition();
		} else {
			play.determineSlots();
			play.calculation();
			Display.print();
		}
		String input;
		int slot;
		slot = play.setSlot();
		input = play.setInput();
		play.input(slot, input);

	}

}
