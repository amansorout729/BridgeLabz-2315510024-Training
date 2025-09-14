package oops5;

class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; 
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients admitted in " + hospitalName + ": " + totalPatients);
    }
    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("-----------------------------------");
    }
}

public class Hospital_Management_System {
    public static void main(String[] args) {
        Patient p1 = new Patient(501, "Alice", 30, "Fever");
        Patient p2 = new Patient(502, "Bob", 45, "Diabetes");
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }
        if (p2 instanceof Patient) {
            p2.displayDetails();
        }
        Patient.getTotalPatients();
    }
}

