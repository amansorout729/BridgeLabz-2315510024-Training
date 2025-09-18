package snippet;

interface MedicalRecord {
 void addRecord(String record);
 void viewRecords();
}

abstract class Patient {
 private String patientId;
 private String name;
 private int age;
 private String diagnosis;  
 private String medicalHistory;  

 public Patient(String patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 public String getPatientId() {
     return patientId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getDiagnosis() {
     return diagnosis;
 }

 public void setDiagnosis(String diagnosis) {
     this.diagnosis = diagnosis;
 }

 public String getMedicalHistory() {
     return medicalHistory;
 }

 public void setMedicalHistory(String medicalHistory) {
     this.medicalHistory = medicalHistory;
 }

 public abstract double calculateBill();

 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

class InPatient extends Patient implements MedicalRecord {
 private int daysAdmitted;
 private double roomChargePerDay;
 private String records = "";

 public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
     super(patientId, name, age);
     this.daysAdmitted = daysAdmitted;
     this.roomChargePerDay = roomChargePerDay;
 }

 public double calculateBill() {
     return daysAdmitted * roomChargePerDay + 500; 
 }

 public void addRecord(String record) {
     records += record + "\n";
 }

 public void viewRecords() {
     System.out.println("Medical Records for " + getName() + ":\n" + records);
 }
}

class OutPatient extends Patient implements MedicalRecord {
 private double consultationFee;
 private String records = "";

 public OutPatient(String patientId, String name, int age, double consultationFee) {
     super(patientId, name, age);
     this.consultationFee = consultationFee;
 }

 public double calculateBill() {
     return consultationFee;  
 }
 public void addRecord(String record) {
     records += record + "\n";
 }

 public void viewRecords() {
     System.out.println("Medical Records for " + getName() + ":\n" + records);
 }
}

public class HospitalManagement {
 public static void main(String[] args) {
     Patient p1 = new InPatient("P101", "Alice", 30, 5, 2000);
     Patient p2 = new OutPatient("P102", "Bob", 25, 800);

     p1.setDiagnosis("Pneumonia");
     p2.setDiagnosis("Flu");

     ((MedicalRecord) p1).addRecord("Admitted for pneumonia treatment.");
     ((MedicalRecord) p2).addRecord("Visited for flu symptoms.");

     Patient[] patients = {p1, p2};
     for (Patient p : patients) {
         p.getPatientDetails();
         System.out.println("Diagnosis: " + p.getDiagnosis());
         System.out.println("Bill Amount: Rs." + p.calculateBill());
         ((MedicalRecord) p).viewRecords();
         System.out.println("-----------------------------------");
     }
 }
}
