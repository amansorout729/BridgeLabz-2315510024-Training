package snippet;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getLocation() {
        return currentLocation;
    }

    public void setLocation(String location) {
        this.currentLocation = location;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: Rs." + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

public class RideHailingApp {
    public static void processRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + v.calculateFare(distance));
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR101", "Alice", 15.0);
        Vehicle bike = new Bike("BIK202", "Bob", 8.0);
        Vehicle auto = new Auto("AUT303", "Charlie", 10.0);

        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("Airport");
        ((GPS) auto).updateLocation("Station");

        Vehicle[] vehicles = {car, bike, auto};
        for (Vehicle v : vehicles) {
            processRide(v, 12.5);
        }
    }
}
