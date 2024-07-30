package khadeer;

public class BankAccount {

	    // Field to store the account balance
	    private double balance;

	    // Constructor to initialize the account with a given balance
	    public BankAccount(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	        }
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money from the account
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Successfully withdrew: " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    // Method to check the current balance
	    public double checkBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        // Create a bank account with an initial balance of 1000
	        BankAccount myAccount = new BankAccount(1000);

	        // Deposit 500 into the account
	        myAccount.deposit(500);

	        // Withdraw 200 from the account
	        myAccount.withdraw(200);

	        // Check the current balance
	        double currentBalance = myAccount.checkBalance();
	        System.out.println("Current balance: " + currentBalance);
	    }
	}


