package oops2;

public class Vehicle_Main {
	public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Nakul", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");

        System.out.println(" Before Updating Registration Fee ");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println(" Updating Registration Fee ");
        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("After Updating Registration Fee ");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }

}
