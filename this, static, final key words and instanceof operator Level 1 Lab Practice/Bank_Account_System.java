package oops5;

class BankAccount {
   
    private static String bankName = "National Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;  
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++; 
    }
    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
       
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }
}


public class Bank_Account_System {
	public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob", 1002, 3000);
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }

}
