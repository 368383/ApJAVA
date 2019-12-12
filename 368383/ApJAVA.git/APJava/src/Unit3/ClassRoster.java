package Unit3;

import java.util.ArrayList;

public class ClassRoster {
	private static final int MAX_NUM = 30;
	private ArrayList<Integer> studentIDList = new ArrayList<Integer>();
	private ArrayList<String> studentList = new ArrayList<String>();

	public ClassRoster() {
		studentIDList = new ArrayList<Integer>();
		studentList = new ArrayList<String>();
	}

	public boolean containsStudent(String studentName) {
		if (studentList.contains(studentName)) {
			return true;
		} else {
			System.out.println("Student does not exist");
			return false;
		}
	}

	public String retrieveById(int id) {
		return studentList.get(studentIDList.indexOf(id));
	}

	public int retrieveByName(String student) {
		return studentIDList.get(studentList.indexOf(student));
	}

	public boolean addStudent(String studentName, int studentId) {
		if (studentList.size() == MAX_NUM) {
			System.out.println("Roster maxed out");
			return false;
		}
		if (containsStudent(studentName) == true) {
			System.out.println("Student already added");
			return false;
		}
		studentList.add(studentName);
		studentIDList.add(studentId);
		System.out.println("Added");
		return true;
	}

	public boolean removeStudent(int id) {
		if (studentIDList.contains(id)) {
			int removeIndex = studentIDList.indexOf(id);
			studentList.remove(removeIndex);
			studentIDList.remove(removeIndex);
			return true;
		} else {
			System.out.println("ID does not exist");
			return false;
		}
	}

	public boolean removeStudent(String name) {
		if (studentList.contains(name)) {
			int removeIndex = studentList.indexOf(name);
			studentList.remove(removeIndex);
			studentIDList.remove(removeIndex);
			return true;
		} else {
			System.out.println("name does not exist");
			return false;
		}
	}
}
