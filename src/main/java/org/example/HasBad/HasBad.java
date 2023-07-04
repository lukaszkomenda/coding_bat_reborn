package org.example.HasBad;

public class HasBad {

    public boolean hadBad(String str) {

        if (str.length() > 3) {
            if (str.startsWith("bad")) {
                return true;
            } else return str.startsWith("bad", 1);
        } else if (str.length() == 3) {
            return str.equals("bad");
        } else {
            return false;
        }

    }
}
