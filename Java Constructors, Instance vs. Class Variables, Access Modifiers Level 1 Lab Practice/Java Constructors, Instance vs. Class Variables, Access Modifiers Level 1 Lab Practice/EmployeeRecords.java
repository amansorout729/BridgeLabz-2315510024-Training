package oops2;


class Employee {
	 public int employeeID;
	 protected String department;
	 private double salary;
	 public Employee(int employeeID, String department, double salary) {
	     this.employeeID = employeeID;
	     this.department = department;
	     this.salary = salary;
	 }
	 public double getSalary() {
	     return salary;
	 }
	 public void setSalary(double salary) {
	     if (salary >= 0) {
	         this.salary = salary;
	     } else {
	         System.out.println("Invalid salary! Cannot be negative.");
	     }
	 }
	 public void displayInfo() {
	     System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
	 }
}
class Manager extends Employee {
	 private int teamSize;
	 public Manager(int employeeID, String department, double salary, int teamSize) {
	     super(employeeID, department, salary);
	     this.teamSize = teamSize;
	 }
	 public void displayManagerInfo() {
	     System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team Size: " + teamSize);
	 }
}
public class EmployeeRecords {
	 public static void main(String[] args) {
	     Employee e1 = new Employee(101, "HR", 50000);
	     e1.displayInfo();
	     e1.setSalary(55000);
	     System.out.println("Updated Salary: " + e1.getSalary());
	     Manager m1 = new Manager(201, "IT", 80000, 10);
	     m1.displayInfo();        
	     m1.displayManagerInfo(); 
	 }
}
