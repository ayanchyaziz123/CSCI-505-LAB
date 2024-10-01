import java.util.Scanner;

public class DateTest {

    // Method to clear the console (works in most modern terminals)
    private static void clearConsole() {
        // ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Method to display the current date
    private static void displayDate(String header, Date date) {
        System.out.printf("%s %s%n", header, date.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for initial date (month, day, year)
        System.out.print("Please enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Please enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();

        // Create a Date object with user input
        Date date = new Date(month, day, year);

        // While loop to allow user to increment the date
        while (true) {
            clearConsole(); // Clear the console before displaying the updated date

            // Display current date
            displayDate("Current date:", date);

            System.out.println("\nChoose an option to increment:");
            System.out.println("1. Increment 1 day");
            System.out.println("2. Increment 1 month");
            System.out.println("3. Increment 1 year");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    date.incrementDay();
                    break;
                case 2:
                    // Incrementing month by simulating the month rollover
                    for (int i = 0; i < date.daysInMonth(); i++) {
                        date.incrementDay();
                    }
                    break;
                case 3:
                    // Increment year
                    date.incrementYear();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
