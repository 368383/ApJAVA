package Quarter3.backToSchool;

public class CollegeStudent extends Student {
	public static String major;

	public static String getMajor() {
		return major;
	}

	public static void setMajor(String major) {
		CollegeStudent.major = major;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		CollegeStudent.year = year;
	}

	public String toString() {
		return super.toString() + "\tyear"+year+"\t major:" + major;
	}

	public static int year;

	public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int myYear,
			String major) {
		super(myName, myAge, myGender, myIdNum, myGPA);
		this.year = myYear;
		this.major = major;
	}
}
