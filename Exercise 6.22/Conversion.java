import java.util.Scanner;

public class Conversion {
    // Method to convert Fahrenheit to Celsius
    public static int fahrenheitToCelsius(int fahrenheit) {
        // Formula: (5/9) * (Fahrenheit - 32)
        return (int) ((5.0 / 9) * (fahrenheit - 32));
    }

    // Method to convert Celsius to Fahrenheit
    public static int celsiusToFahrenheit(int celsius) {
        // Formula: (9/5) * Celsius + 32
        return (int) ((9.0 / 5) * celsius + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion Application");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("0. Exit"); // Option to exit the program

        // Infinite loop to allow continuous conversions until the user decides to exit
        while (true) {
            System.out.print("Choose an option (0, 1, or 2): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                int fahrenheit = scanner.nextInt();
                int celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
            } else if (choice == 2) {
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                int celsius = scanner.nextInt();
                int fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
            } else if (choice == 0) {
                // Exit the program
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice! Please select 0, 1, or 2.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
