package oops5;


class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
    }
}

public class Employee_Management_System  {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Software Engineer");
        Employee e2 = new Employee(102, "Bob", "Project Manager");
        if (e1 instanceof Employee) {
            e1.displayDetails();
        }
        if (e2 instanceof Employee) {
            e2.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
}