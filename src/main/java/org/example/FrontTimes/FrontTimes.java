package org.example.FrontTimes;

public class FrontTimes {
    public String frontTimes(String str, int n){
        int frontLen = 3;

        if (frontLen > str.length()){
            frontLen = str.length();
        }

        String front = str.substring(0,frontLen);

        return front.repeat(Math.max(0, n));
    }
}
