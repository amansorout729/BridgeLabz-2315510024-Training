package oops2;


class BankAccount {
	 public int accountNumber;
	 protected String accountHolder;
	 private double balance;
	 public BankAccount(int accountNumber, String accountHolder, double balance) {
	     this.accountNumber = accountNumber;
	     this.accountHolder = accountHolder;
	     this.balance = balance;
	 }
	 public double getBalance() {
	     return balance;
	 }
	 public void setBalance(double balance) {
	     if (balance >= 0) {
	         this.balance = balance;
	     } else {
	         System.out.println("Invalid balance! Cannot be negative.");
	     }
	 }
	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Deposited: " + amount + " | New Balance: " + balance);
	     } else {
	         System.out.println("Deposit amount must be positive.");
	     }
	 }
	 public void withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
	     } else {
	         System.out.println("Invalid withdrawal. Check balance or amount.");
	     }
	 }
	 public void displayInfo() {
	     System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
	 }
}
class SavingsAccount extends BankAccount {
	 private double interestRate;
	 public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
	     super(accountNumber, accountHolder, balance);
	     this.interestRate = interestRate;
	 }
	 public void displaySavingsInfo() {
	     System.out.println("Savings Account Holder: " + accountHolder + ", Account No: " + accountNumber + ", Interest Rate: " + interestRate + "%");
	 }
}
public class BankAccountManagement {
	 public static void main(String[] args) {
	     BankAccount acc1 = new BankAccount(1001, "Alice", 5000);
	     acc1.displayInfo();
	     acc1.deposit(2000);
	     acc1.withdraw(1500);
	     acc1.setBalance(8000);
	     System.out.println("Updated Balance: " + acc1.getBalance());
	     SavingsAccount sa1 = new SavingsAccount(2001, "Bob", 10000, 4.5);
	     sa1.displayInfo();      
	     sa1.displaySavingsInfo(); 
	 }
}
