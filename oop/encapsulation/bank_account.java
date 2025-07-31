/**
 * BankAccount.java
 * Demonstrates encapsulation in Java - the practice of bundling data and methods
 * and restricting direct access to internal state
 * Part of the Java Basics and OOP Tutorial
 */
public class BankAccount {
    // The balance is 'private', so it cannot be accessed directly from outside this class
    private double balance;
    private String accountNumber;
    private String accountHolderName;
    
    // Constructor to initialize account
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Start with zero balance
    }
    
    // Constructor with initial balance
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(initialBalance); // Use setter to validate initial balance
    }
    
    // Public "getter" method to allow read-only access to the balance
    public double getBalance() {
        return this.balance;
    }
    
    // Public "getter" for account number
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    // Public "getter" for account holder name
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    
    // Public "setter" method to allow controlled modification of the balance
    public void setBalance(double newBalance) {
        // Validation logic: protect the object's state
        if (newBalance >= 0) {
            this.balance = newBalance;
            System.out.println("Balance updated to: $" + this.balance);
        } else {
            System.out.println("Error: Balance cannot be set to a negative value.");
        }
    }
    
    // A method that uses the internal state in a controlled way
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + this.balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    
    // Another method for controlled state modification
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds. Current balance: $" + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("New balance: $" + this.balance);
        }
    }
    
    // Method to transfer money to another account
    public void transferTo(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be positive.");
            return;
        }
        
        if (amount > this.balance) {
            System.out.println("Error: Insufficient funds for transfer. Current balance: $" + this.balance);
            return;
        }
        
        // Perform the transfer
        this.balance -= amount;
        targetAccount.balance += amount; // Direct access allowed within same class
        
        System.out.println("Transferred $" + amount + " to account " + targetAccount.getAccountNumber());
        System.out.println("Your new balance: $" + this.balance);
    }
    
    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Current Balance: $" + this.balance);
        System.out.println("===========================");
    }
    
    // Method to check if account has sufficient funds
    public boolean hasSufficientFunds(double amount) {
        return this.balance >= amount;
    }
    
    // Method to calculate interest (example of internal calculation)
    public void addInterest(double interestRate) {
        if (interestRate < 0) {
            System.out.println("Error: Interest rate cannot be negative.");
            return;
        }
        
        double interest = this.balance * (interestRate / 100);
        this.balance += interest;
        System.out.println("Interest added: $" + String.format("%.2f", interest) + 
                          " at rate " + interestRate + "%");
        System.out.println("New balance: $" + String.format("%.2f", this.balance));
    }
}

/**
 * BankClerk.java
 * A separate class to demonstrate the use of the BankAccount with encapsulation
 */
class BankClerk {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Encapsulation Demo ===\n");
        
        // Create bank accounts
        BankAccount johnAccount = new BankAccount("ACC-001", "John Doe", 1