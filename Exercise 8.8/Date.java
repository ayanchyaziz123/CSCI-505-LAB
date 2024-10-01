public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Constructor
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        // Validate day
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // Check for leap year if February 29th is the date
        if (month == 2 && day == 29 && !(isLeapYear(year))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Increment the day by 1
    public void incrementDay() {
        if (day < daysInMonth()) {
            day++;
        } else {
            day = 1; // Reset day to 1
            incrementMonth();
        }
    }

    // Helper method to get the number of days in the current month
    public int daysInMonth() {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return daysPerMonth[month];
    }

    // Increment the month, and handle the year transition
    public void incrementMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1; // Reset to January
            incrementYear();    // Increment the year
        }

        // Adjust the day if the new month has fewer days than the current day
        if (day > daysInMonth()) {
            day = daysInMonth();
        }
    }

    // Increment the year
    public void incrementYear() {
        year++;
    }

    // toString method to return date as a string
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
