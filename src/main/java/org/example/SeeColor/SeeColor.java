package org.example.SeeColor;

public class SeeColor {

    public String seeColor(String str){
        String red = "red";
        String blue = "blue";

        if (str.startsWith(red)){
            return red;
        } else if (str.startsWith(blue)) {
            return blue;
        } else {
            return "";
        }

    }
}
