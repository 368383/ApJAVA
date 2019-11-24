package projectX;

public class classTester {
	public static void main(String args[]) {
		Pet dog = new Pet("greyhound", 20);
		System.out.println("Dog age " + dog.age);

		PetFunctions game = new PetFunctions();
		game.tester(dog);
	}
}
