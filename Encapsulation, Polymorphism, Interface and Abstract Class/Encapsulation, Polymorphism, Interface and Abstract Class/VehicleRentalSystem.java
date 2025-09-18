package snippet;

interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
 private String vehicleNumber;
 private String type;
 private double rentalRate;
 private String insurancePolicyNumber;

 public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
     this.insurancePolicyNumber = policyNumber;
 }

 public String getVehicleNumber() { return vehicleNumber; }
 public String getType() { return type; }
 public double getRentalRate() { return rentalRate; }
 public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

 protected String getInsurancePolicyNumber() { return insurancePolicyNumber; }

 public abstract double calculateRentalCost(int days);

 public void displayDetails() {
     System.out.println("Vehicle No: " + vehicleNumber);
     System.out.println("Type: " + type);
     System.out.println("Rental Rate (per day): " + rentalRate);
 }
}

class Car extends Vehicle {
 public Car(String num, double rate, String policy) {
     super(num, "Car", rate, policy);
 }

 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 public double calculateInsurance() {
     return getRentalRate() * 0.15; 
 }

 public String getInsuranceDetails() {
     return "Car Insurance Policy: " + getInsurancePolicyNumber();
 }
}

class Bike extends Vehicle {
 public Bike(String num, double rate, String policy) {
     super(num, "Bike", rate, policy);
 }

 public double calculateRentalCost(int days) {
     return getRentalRate() * days * 0.8;
 }

 public double calculateInsurance() {
     return getRentalRate() * 0.05;
 }

 public String getInsuranceDetails() {
     return "Bike Insurance Policy: " + getInsurancePolicyNumber();
 }
}

class Truck extends Vehicle {
 public Truck(String num, double rate, String policy) {
     super(num, "Truck", rate, policy);
 }

 public double calculateRentalCost(int days) {
     return getRentalRate() * days + 500; 
 }

 public double calculateInsurance() {
     return getRentalRate() * 0.20;
 }

 public String getInsuranceDetails() {
     return "Truck Insurance Policy: " + getInsurancePolicyNumber();
 }
}

public class VehicleRentalSystem {
 public static void main(String[] args) {
     Vehicle v1 = new Car("CAR101", 2000, "CAR-INS-001");
     Vehicle v2 = new Bike("BIKE202", 500, "BIKE-INS-002");
     Vehicle v3 = new Truck("TRUCK303", 4000, "TRUCK-INS-003");

     Vehicle[] vehicles = {v1, v2, v3};

     for (Vehicle v : vehicles) {
         v.displayDetails();
         double rental = v.calculateRentalCost(5); 
         double insurance = v.calculateInsurance();
         System.out.println(v.getInsuranceDetails());
         System.out.println("Rental for 5 days: " + rental);
         System.out.println("Insurance Cost: " + insurance);
         System.out.println("Total Cost: " + (rental + insurance));
         System.out.println("----------------------------");
     }
 }
}
