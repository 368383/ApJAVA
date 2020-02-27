package Quarter3.backToSchool;

public class Teacher extends Person {
	public static String subject;
	public static double salary;

	public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
		super(myName, myAge, myGender);
		this.subject = subject;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "\tsubject: " + subject + "\tsalary: " + salary;
	}

	public static String getSubject() {
		return subject;
	}

	public static void setSubject(String subject) {
		Teacher.subject = subject;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Teacher.salary = salary;
	}
}
