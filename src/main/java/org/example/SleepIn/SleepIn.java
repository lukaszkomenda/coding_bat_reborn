package org.example.SleepIn;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        }
        return !weekday || vacation;
    }
}
