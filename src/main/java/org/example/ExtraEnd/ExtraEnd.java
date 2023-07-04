package org.example.ExtraEnd;

public class ExtraEnd {
    public String extraEnd(String str){
        String pattern = str.substring(str.length() -2);
        return pattern + pattern + pattern;
    }
}
