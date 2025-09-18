package snippet;

interface Department {
 void assignDepartment(String deptName);
 String getDepartmentDetails();
}

abstract class Employee implements Department {
 private int employeeId;
 private String name;
 private double baseSalary;
 private String department;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() { return employeeId; }
 public String getName() { return name; }
 public double getBaseSalary() { return baseSalary; }
 public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 public String getDepartmentDetails() {
     return department;
 }
 
 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: " + baseSalary);
     System.out.println("Department: " + department);
     System.out.println("Calculated Salary: " + calculateSalary());
     System.out.println("----------------------------");
 }
}

class FullTimeEmployee extends Employee {
 private double monthlySalary;

 public FullTimeEmployee(int id, String name, double baseSalary, double monthlySalary) {
     super(id, name, baseSalary);
     this.monthlySalary = monthlySalary;
 }

 public double calculateSalary() {
     return monthlySalary;
 }
}

class PartTimeEmployee extends Employee {
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
     super(id, name, baseSalary);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}

public class EmployeeManagementSystem {
 public static void main(String[] args) {
     Employee e1 = new FullTimeEmployee(101, "Alice", 30000, 50000);
     Employee e2 = new PartTimeEmployee(102, "Bob", 10000, 80, 200);

     e1.assignDepartment("HR");
     e2.assignDepartment("IT");

     Employee[] employees = {e1, e2};

     for (Employee e : employees) {
         e.displayDetails();
     }
 }
}
