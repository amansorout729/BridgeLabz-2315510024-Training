package oops5;

class Vehicle {
    static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("--------------------------------------");
    }
}

public class Vehicle_Registration_System {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH01AB1234", "Alice", "Car");
        Vehicle v2 = new Vehicle("MH02CD5678", "Bob", "Bike");
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }
        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }
        Vehicle.updateRegistrationFee(6000.0);
        v1.displayDetails();
        v2.displayDetails();
    }
}

