package oops5;

class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println(name + "'s grade updated to: " + grade);
    }
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------------------");
    }
}

public class University_Student_Management {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade("A+");
        }

        if (s2 instanceof Student) {
            s2.displayDetails();
            s2.updateGrade("B+");
        }
        Student.displayTotalStudents();
    }
}

