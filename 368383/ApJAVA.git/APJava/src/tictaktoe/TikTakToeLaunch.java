package tictaktoe;

import bankPart2.Utility;

public class TikTakToeLaunch {
	public static int round = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game play = new Game();
		play.set();
		if (random() == 1) {
			System.out.println("Human Input");
			humanPlay(play);
		} else {
			System.out.println("Computer Input");
			computerPlay(play);
		}

	}

	public static int random() {
		int alpha = (int) (Math.random() * 2 + 1);
		System.out.println(alpha);
		return alpha;
	}

	public static void humanPlay(Game play) {

		System.out.println(
				"To choose slot, insert value from 1 to 9 when prompted | To input, insert either X or an O (not case sensitive)");

		String input = null;
		int slot = 0;
		while (round <= 6) {
			if (round == 6) {
				break;
			} else {
				System.out.println("=========NEXT ROUND " + round + " ===========");
			}
			Display.print();
			if (humanInput(play, round)) {
				System.out.println("PROGRAM COMPLETE");
				break;
			}
			round++;
		}

	}

	public static void computerPlay(Game play) {
		System.out.println(
				"To choose slot, insert value from 1 to 9 when prompted | To input, insert either X or an O (not case sensitive)");

		String input = null;
		int slot = 0;
		while (round <= 5) {

			Display.print();
			if (computerInput(play, round)) {
				System.out.println("Program complete");
			}

			round++;

		}

	}

	private static boolean humanInput(Game play, int round) {
		int slot = play.setSlot();
		String input = play.setInput();
		play.input(slot, input);

		Display.print();
		System.out.println("COMPUTERS TURN");
		play.determineSlots();
		return play.calculation();
	}

	private static boolean computerInput(Game play, int round) {
		System.out.println("COMPUTERS TURN");
		play.computerInput = "X";
		play.determineSlots();
		if (play.calculation()) {
			return true;
		}
		Display.print();
		if (round != 5) {
			String input;
			int slot;
			slot = play.setSlot();
			input = play.setInput();
			play.input(slot, input);
		} else {
			System.out.println("program done");
		}
		return false;

	}

}
