package org.example.Without2;

public class Without2 {

    public String without2(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            String front = str.substring(0,2);
            String end = str.substring(str.length() - 2);
            if (front.equals(end)){
                return str.substring(2);
            } else {
                return str;
            }
        }
    }
}
