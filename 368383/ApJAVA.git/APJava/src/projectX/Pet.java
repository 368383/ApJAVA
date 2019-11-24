package projectX;

public class Pet {
	public String breed;
	public int age;

	public Pet(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}

	public void aged(int increase) {
		age = age + increase;
		System.out.println("age of pet " + age);
	}
}
