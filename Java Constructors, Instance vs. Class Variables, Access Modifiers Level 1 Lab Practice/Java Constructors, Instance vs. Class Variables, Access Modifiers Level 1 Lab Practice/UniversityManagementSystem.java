package oops2;

class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double CGPA) {
		if (CGPA >= 0 && CGPA <= 10) {
			this.CGPA = CGPA;
		} else {
			System.out.println("Invalid CGPA! Must be between 0 and 10.");
		}
	}

 
	public void displayInfo() {
		System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
	}
}


class PostgraduateStudent extends Student {
	private String specialization;
	public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
		super(rollNumber, name, CGPA);
		this.specialization = specialization;
	}
	public void displayPGInfo() {
     System.out.println("PG Student Name: " + name + ", Specialization: " + specialization);
 }
}

public class UniversityManagementSystem {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Alice", 8.5);
     s1.displayInfo();
     s1.setCGPA(9.0);
     System.out.println("Updated CGPA: " + s1.getCGPA());
     PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Artificial Intelligence");
     pg1.displayInfo();
     pg1.displayPGInfo();
 }
}

