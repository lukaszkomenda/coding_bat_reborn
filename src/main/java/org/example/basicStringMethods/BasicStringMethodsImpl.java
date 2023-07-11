package org.example.basicStringMethods;

public class BasicStringMethodsImpl implements BasicStringMethods{
    @Override
    public String helloName(String name) {
        return "Hello " + name;
    }

    @Override
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    @Override
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    @Override
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    @Override
    public String extraEnd(String str) {
        String pattern = str.substring(str.length() -2);
        return pattern + pattern + pattern;
    }

    @Override
    public String firstTwo(String str) {
        if (str.length() >= 2){
            return str.substring(0,2);
        } else if (str.length() == 1) {
            return str.substring(0,1);
        } else {
            return "";
        }
    }

    @Override
    public String firstHalf(String str) {
        int half = str.length() /2;
        return str.substring(0,half);
    }
}
