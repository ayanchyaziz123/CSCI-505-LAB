import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Creating two accounts with initial balances
        Account account1 = new Account("Rahman", 1000.01);
        Account account2 = new Account("Nakib", 999.99);

        // Displaying the initial balance of both accounts
        System.out.printf("%s Balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);

        // Deposit into account1
        System.out.print("Enter the amount to deposit into account1: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("Successfully deposited amount: $%.2f%n", depositAmount);
        System.out.printf("%s Balance: $%.2f%n", account1.getName(), account1.getBalance());

        // Withdraw from account1
        System.out.print("Enter the amount to withdraw from account1: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.printf("%s Balance: $%.2f%n", account1.getName(), account1.getBalance());

        // Deposit into account2
        System.out.print("\nEnter the amount to deposit into account2: ");
        depositAmount = scanner.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("Successfully deposited amount: $%.2f%n", depositAmount);
        System.out.printf("%s Balance: $%.2f%n", account2.getName(), account2.getBalance());

        // Withdraw from account2
        System.out.print("Enter the amount to withdraw from account2: ");
        withdrawAmount = scanner.nextDouble();
        account2.withdraw(withdrawAmount);
        System.out.printf("%s Balance: $%.2f%n", account2.getName(), account2.getBalance());

        // Displaying a formatted balance summary for both accounts
        System.out.println(); // Adding a blank line for spacing
        System.out.println("Balance Summary"); // Title for the balance section
        System.out.println("#################################"); // Decorative line for design

        // Display the account name and balance in a formatted manner
        System.out.printf("%-10s : $%.2f%n", account1.getName(), account1.getBalance());
        // %-10s - formats the name to be left-aligned within 10 characters
        // %.2f - formats the balance to two decimal places

        System.out.printf("%-10s : $%.2f%n", account2.getName(), account2.getBalance());
        // Same formatting applied for the second account

        System.out.println("#################################"); // Ending decorative line

        scanner.close();
    }
}
