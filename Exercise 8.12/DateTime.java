public class DateTime {
    private Time2 time; // Time2 object to handle time
    private Date date;  // Date object to handle date

    // Constructor that accepts a Date and a Time2 object
    public DateTime(Date date, Time2 time) {
        if (date == null || time == null) {
            throw new IllegalArgumentException("Date and Time cannot be null");
        }
        this.date = date;
        this.time = time;
    }

    // Increment the time by one second
    public void incrementSecond() {
        time.incrementSecond();
        if (time.getHour() == 0 && time.getMinute() == 0 && time.getSecond() == 0) {
            date.incrementDay(); // Increment the date if time rolls over to the next day
        }
    }

    // Increment the time by one minute
    public void incrementMinute() {
        time.incrementMinute();
        if (time.getHour() == 0 && time.getMinute() == 0) {
            date.incrementDay(); // Increment the date if time rolls over to the next day
        }
    }

    // Increment the time by one hour
    public void incrementHour() {
        time.incrementHour();
        if (time.getHour() == 0) {
            date.incrementDay(); // Increment the date if time rolls over to the next day
        }
    }

    // Increment the date by one day
    public void incrementDay() {
        date.incrementDay(); // Rolls over months and years if necessary
    }

    // Increment the date by one month
    public void incrementMonth() {
        date.incrementMonth(); // Rolls over the year if necessary
    }

    // Increment the date by one year
    public void incrementYear() {
        date.incrementYear(); // Handles leap years appropriately
    }

    // Return DateTime in universal (24-hour) format with the date
    public String toUniversalString() {
        return String.format("%s %s", date.toString(), time.toUniversalString());
    }

    // Return DateTime in standard (12-hour) format with the date
    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}
