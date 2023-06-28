package org.example.StringTimes;

public class StringTimes {
    public String stringTimes(String str, int n){

        return String.valueOf(str).repeat(Math.max(0, n));
    }
}
