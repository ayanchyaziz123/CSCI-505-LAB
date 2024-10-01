public class Time2 {
    private int hour;   // 0-23 (24-hour format)
    private int minute; // 0-59
    private int second; // 0-59

    // Default constructor initializing time to 00:00:00
    public Time2() {
        this(0, 0, 0);
    }

    // Constructor to initialize only hour
    public Time2(int hour) {
        this(hour, 0, 0);
    }

    // Constructor to initialize hour and minute
    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor to initialize hour, minute, and second
    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Method to set hour, minute, and second
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) throw new IllegalArgumentException("Hour must be 0-23");
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("Minute must be 0-59");
        if (second < 0 || second >= 60) throw new IllegalArgumentException("Second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get methods
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // Method to increment the second
    public void incrementSecond() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute(); // Increment minute if seconds overflow
        }
    }

    // Method to increment the minute
    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour(); // Increment hour if minutes overflow
        }
    }

    // Method to increment the hour
    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0; // Reset to 0 after 23 hours (i.e., new day)
        }
    }

    // Returns time in universal (24-hour) format
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // Returns time in standard (12-hour) format
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(),
            (getHour() < 12 ? "AM" : "PM"));
    }
}
