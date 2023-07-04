package org.example.DeFront;

public class DeFront {

    public String deFront(String str) {
        String firstLetter = str.substring(0, 1);
        String secondLetter = str.substring(1, 2);

        if (firstLetter.equals("a") && secondLetter.equals("b")) {
            return str;
        } else if (!firstLetter.equals("a") && secondLetter.equals("b")) {
            return str.substring(1);
        } else if (firstLetter.equals("a")) {
            return firstLetter + str.substring(2);
        } else {
            return str.substring(2);
        }

    }
}
