import java.util.Scanner;

public class DateTimeTest {

    // Method to clear the console (works in most modern terminals)
    private static void clearConsole() {
        // ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Method to display the current DateTime
    private static void displayDateTime(String header, DateTime dateTime) {
        System.out.printf("%s%n", header);
        System.out.printf("Standard (12-hour): %s%n", dateTime.toString());
        System.out.printf("Universal (24-hour): %s%n", dateTime.toUniversalString());
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the initial date (month, day, year)
        System.out.print("Please enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Please enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();

        // Get user input for the initial time (hour, minute, second)
        System.out.print("Please enter the hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Please enter the minute (0-59): ");
        int minute = scanner.nextInt();

        System.out.print("Please enter the second (0-59): ");
        int second = scanner.nextInt();

        // Create Date and Time2 objects with user input
        Date date = new Date(month, day, year);
        Time2 time = new Time2(hour, minute, second);

        // Create a DateTime object
        DateTime dateTime = new DateTime(date, time);

        // While loop to allow user to increment the date and time
        while (true) {
            clearConsole(); // Clear the console before displaying the updated DateTime

            // Display current DateTime
            displayDateTime("Current DateTime:", dateTime);

            System.out.println("\nChoose an option to increment:");
            System.out.println("1. Increment 1 second");
            System.out.println("2. Increment 1 minute");
            System.out.println("3. Increment 1 hour");
            System.out.println("4. Increment 1 day");
            System.out.println("5. Increment 1 month");
            System.out.println("6. Increment 1 year");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dateTime.incrementSecond();
                    break;
                case 2:
                    dateTime.incrementMinute();
                    break;
                case 3:
                    dateTime.incrementHour();
                    break;
                case 4:
                    dateTime.incrementDay();
                    break;
                case 5:
                    date.incrementMonth(); // Increment month
                    break;
                case 6:
                    date.incrementYear(); // Increment year
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
