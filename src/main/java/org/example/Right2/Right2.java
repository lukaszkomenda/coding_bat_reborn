package org.example.Right2;

public class Right2 {

    public String right2(String str){
        String end = str.substring(str.length() - 2);
        return end + str.substring(0,str.length() - 2);
    }
}
