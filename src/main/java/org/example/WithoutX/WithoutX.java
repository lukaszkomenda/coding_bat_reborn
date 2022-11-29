package org.example.WithoutX;

public class WithoutX {

    public String withoutX(String str) {

        if (str.startsWith("x") && str.endsWith("x")) {
            if (str.length() == 1) {
                return "";
            } else {
                return str.substring(1, str.length() - 1);
            }
        } else if (str.startsWith("x") && !str.endsWith("x")) {
            return str.substring(1);
        } else if (!str.startsWith("x") && str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
