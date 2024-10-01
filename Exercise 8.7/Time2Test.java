import java.util.Scanner;

public class Time2Test {

    // Display time in both 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n Universal time: %s%n Standard time: %s%n", header, t.toUniversalString(), t.toString());
    }

    // Method to clear the console (works in most modern terminals)
    private static void clearConsole() {
        // ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for initial hour, minute, and second
        System.out.print("Please enter the hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Please enter the minute (0-59): ");
        int minute = scanner.nextInt();

        System.out.print("Please enter the second (0-59): ");
        int second = scanner.nextInt();

        // Create a Time2 object with user input
        Time2 t = new Time2(hour, minute, second);

        // While loop to allow user to increment the time
        while (true) {
            clearConsole(); // Clear the console before displaying the updated time

            // Display current time
            displayTime("Current time:", t);

            System.out.println("\nChoose an option to increment:");
            System.out.println("1. Increment 1 hour");
            System.out.println("2. Increment 1 minute");
            System.out.println("3. Increment 1 second");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    t.incrementHour();
                    break;
                case 2:
                    t.incrementMinute();
                    break;
                case 3:
                    t.incrementSecond();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
        }
    }
}
