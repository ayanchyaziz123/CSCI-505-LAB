public class Account {
    // Private instance variables for account name and balance
    private String name;
    private double balance;

    // Constructor with two parameters: name and initial balance
    public Account(String name, double balance) {
        this.name = name; // Assign the name to the account
        // Initialize balance only if the provided amount is positive
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // Deposit method to add money to the account
    public void deposit(double depositAmount) {
        // Check if the deposit amount is positive
        if (depositAmount > 0.0) {
            this.balance += depositAmount; // Add the deposit amount to the balance
        } else {
            System.out.println("Invalid Amount."); // Display error message for invalid deposit amount
        }
    }

    // Withdraw method to remove money from the account
    public void withdraw(double withdrawAmount) {
        // Check if the balance is sufficient for the withdrawal
        if (this.balance >= withdrawAmount) {
            this.balance -= withdrawAmount; // Deduct the withdrawal amount from the balance
        } else {
            System.err.println("Withdrawal amount exceeded account balance."); // Error message for insufficient balance
        }
    }

    // Method to set the account name
    public void setName(String name) {
        this.name = name;
    }

    // Method to set the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to get the account name
    public String getName() {
        return this.name;
    }

    // Method to get the account balance
    public double getBalance() {
        return this.balance;
    }
}
