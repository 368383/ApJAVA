import java.util.ArrayList;
import java.util.Collections;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Prints your name and period.
		System.out.println("Jonathan Young Period 1");
//		-	Creates an ArrayList of Strings.
		ArrayList<String> listofStrings = new ArrayList<String>();
		// - Has a method called fillArrayList that uses the 2 add methods
//				in the ArrayList classs to do the following:
//		-	Adds “hamster" to the ArrayList
		listofStrings.add("hamster");
//		-	Adds "cat" to the beginning of the ArrayList
		listofStrings.add(0, "cat");
//		-	Adds "bird" to the beginning of the ArrayList
		listofStrings.add(0, "bird");
//		-	Adds "dog" to the list in alphabetical order 
		listofStrings.add("dog");
//		-	Adds "iguana" to end of the list
		listofStrings.add(listofStrings.size(), "iguana");
//		-	Adds "fish" to the list in alphabetical order 
		listofStrings.add("fish");
		Collections.sort(listofStrings);
		// - Adds "ferret" to the list in alphabetical order
		listofStrings.add("ferret");
		Collections.sort(listofStrings);
//		-	Adds “turtle” to the end of the list	
		listofStrings.add("turtle");
//		-	After the call to fillArrayList prints the list using the 
//				toString method.
		System.out.println(listofStrings.toString());
//		-	Has a method called printAllElements that uses other methods in 
//				the ArrayList class to print the ArrayList, 
//					one string per line.
		System.out.println("method printAllElements");
		printAllElements(listofStrings);
//		-	Has a method called printElements that does the following.  
//			-	Prints the first element of the list
//			-	Prints the last element of the list	
//			-	Prints the third element of the list
//			-	Prints the index of “fish”						
		printElements(listofStrings);
//		-	Has a method called removeElements that does the following:
//			-	Removes the first element of the list
//			-	Removes the last element of the list
//			-	Removes the fifth element from the list (after bird is removed)
		removeElements(listofStrings);
//		-	Changes “dog” to “puppy”
		listofStrings.set(listofStrings.indexOf("dog"), "puppy");
//		-	Uses the toString method to print the new list
		System.out.println("Arraylist " + listofStrings.toString());
//		-	Clears the list
		listofStrings.clear();
//		-	Uses the toString method to print the new list
		System.out.println("Arraylist " + listofStrings.toString());

	}

	public static void printAllElements(ArrayList<String> insert) {
		for (int i = 0; i < insert.size(); i++) {
			System.out.println("index " + i + "\t" + insert.get(i));
		}
	}

	public static void printElements(ArrayList<String> insert) {
		//System.out.println(insert.toString());
		System.out.println("first element " + insert.get(0));
		System.out.println("last element " + insert.get(insert.size() - 1));
		System.out.println("3 element " + insert.get(2));
		System.out.println("fish element " + insert.indexOf("fish"));
	}

	public static void removeElements(ArrayList<String> insert) {
		insert.remove(0);
		insert.remove(insert.size() - 1);
		insert.remove(4);
		System.out.println("After removed " + insert.toString());
	}

}
