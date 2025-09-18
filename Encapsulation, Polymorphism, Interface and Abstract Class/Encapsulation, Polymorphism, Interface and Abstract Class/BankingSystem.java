package snippet;

interface Loanable {
 void applyForLoan(double amount);
 boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 public String getAccountNumber() { return accountNumber; }
 public String getHolderName() { return holderName; }
 public double getBalance() { return balance; }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited. New Balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn. New Balance: " + balance);
     } else {
         System.out.println("Insufficient balance or invalid amount!");
     }
 }

 protected void setBalance(double balance) {
     this.balance = balance;
 }

 public abstract double calculateInterest();

 public void displayDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Holder Name: " + holderName);
     System.out.println("Balance: " + balance);
 }
}

class SavingsAccount extends BankAccount {
 public SavingsAccount(String accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 public double calculateInterest() {
     return getBalance() * 0.04; // 4% interest
 }

 public void applyForLoan(double amount) {
     System.out.println("Savings Account Loan Application for " + amount);
 }
 public boolean calculateLoanEligibility() {
     return getBalance() >= 5000; // eligible if balance ≥ 5000
 }
}
class CurrentAccount extends BankAccount {
 public CurrentAccount(String accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 public double calculateInterest() {
     return getBalance() * 0.02; // 2% interest
 }

 public void applyForLoan(double amount) {
     System.out.println("Current Account Loan Application for " + amount);
 }

 public boolean calculateLoanEligibility() {
     return getBalance() >= 20000; // eligible if balance ≥ 20000
 }
}

public class BankingSystem {
 public static void main(String[] args) {
     BankAccount a1 = new SavingsAccount("SAV101", "Alice", 8000);
     BankAccount a2 = new CurrentAccount("CUR202", "Bob", 30000);

     BankAccount[] accounts = {a1, a2};

     for (BankAccount acc : accounts) {
         acc.displayDetails();
         double interest = acc.calculateInterest();
         System.out.println("Interest: " + interest);

         acc.applyForLoan(10000);
         if (acc.calculateLoanEligibility()) {
             System.out.println("Loan Approved");
         } else {
             System.out.println("Loan Denied");
         }

         System.out.println("----------------------------");
     }
 }
}
