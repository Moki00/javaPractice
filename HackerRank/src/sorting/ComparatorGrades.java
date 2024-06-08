package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorGrades {

	public static void main(String[] args) {

		// make a list of students
		List<Student> studentList = new ArrayList<Student>();

		// add students to studentList
		Student student = new Student(11, "Morgan", 3.3);
		studentList.add(student);
		student = new Student(12, "Max", 3.1);
		studentList.add(student);
		studentList.add(new Student(13, "Rio", 3.6));
		studentList.add(new Student(14, "Koto", 3.3));
		studentList.add(new Student(15, "Koto", 3.3));

		// sort studentList by grade, name, then id
		final Comparator<Student> GRADE_ORDER = new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if (s2.getGrade() == s1.getGrade()) { // grades are same
					if (s2.getName().equals(s1.getName())) { // names are same
						// sort by id last if name and grades are same
						return Integer.compare(s1.getId(), s2.getId());
					}
					// sort in alphabetic order if grades are same
					return s1.getName().compareTo(s2.getName());
				}
				// sort grade in decreasing order
				return Double.compare(s2.getGrade(), s1.getGrade());
			}
		};

		// sort studentList with Grade Order first
		Collections.sort(studentList, GRADE_ORDER);

		System.out.println("id - name");
		// print out each student
		for (Student s : studentList) {
			System.out.print(s.getId() + " - ");
			System.out.println(s.getName());
		}
	}
}

class Student {

	private int id;
	private String firstName;
	private double grade;

	public Student(int id, String firstName, double grade) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return firstName;
	}

	public double getGrade() {
		return grade;
	}
}
