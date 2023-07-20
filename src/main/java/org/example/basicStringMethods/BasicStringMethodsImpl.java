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

    @Override
    public String withoutEnd(String str) {
        return str.substring(1, str.length() -1);
    }

    @Override
    public String comboString(String a, String b) {
        if (a.length() >= b.length()){
            return b + a + b;
        } else {
            return a+b+a;
        }
    }

    @Override
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    @Override
    public String left2(String str) {
        String end = str.substring(0,2);

        return str.substring(2) + end;
    }

    @Override
    public String right2(String str) {
        String end = str.substring(str.length() - 2);
        return end + str.substring(0,str.length() - 2);
    }

    @Override
    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    @Override
    public String withoutEnd2(String str) {
        if(str.length() >= 2){
            return str.substring(1, str.length() - 1);
        } else{
            return "";
        }
    }

    @Override
    public String middleTwo(String str) {
        int length = str.length();
        if (length > 2){
            return str.substring(length/2 - 1, length / 2 + 1);
        } else {
            return str;
        }
    }

    @Override
    public boolean endsLy(String str) {
        int length = str.length();

        if (length >= 2){
            return str.endsWith("ly");
        } else {
            return false;
        }
    }

    @Override
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    @Override
    public String twoChar(String str, int index) {
        boolean isItCharsInWord = index + 2 <= str.length() && index >= 0;

        if(isItCharsInWord){
            return str.substring(index, index + 2);
        } else {
            return str.substring(0,2);
        }
    }

    @Override
    public String middleThree(String str) {
        int position;
        int length;

        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 3;
        } else{
            position = str.length() / 2;
            length = 2;
        }
        return str.substring(position - 1, position + length);
    }

    @Override
    public boolean hasBad(String str) {
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

    @Override
    public String atFirst(String str) {
        if (str.length() >= 2){
            return str.substring(0,2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    @Override
    public String lastChars(String a, String b) {
        String result = "";

        if (a.length() != 0){
            result += a.substring(0,1);
        } else {
            result += "@";
        }

        if (b.length() != 0){
            result += b.substring(b.length()-1);
        } else {
            result += "@";
        }

        return result;
    }

    @Override
    public String conCat(String a, String b) {
        String mergedAb = a + b;

        if (a.length() != 0 && b.length() != 0){
            String lastLetterA = a.substring(a.length() -1);
            String firstLetterB = b.substring(0,1);

            if (lastLetterA.equals(firstLetterB)){
                return a + b.substring(1);
            } else {
                return mergedAb;
            }
        } else {
            return mergedAb;
        }
    }

    @Override
    public String lastTwo(String str) {
        int length = str.length();

        if (length > 2){
            String beforeLastChar = str.substring(length - 2, length - 1);
            String lastChar = str.substring(length-1);

            return str.substring(0, length -2) + lastChar + beforeLastChar;
        } else if (length == 2){
            String beforeLastChar = str.substring(0, length - 1);
            String lastChar = str.substring(length-1);

            return lastChar + beforeLastChar;
        } else {
            return str;
        }
    }

    @Override
    public String seeColor(String str) {
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

    @Override
    public boolean frontAgain(String str) {
        if (str.length() >= 2){
            String front = str.substring(0,2);

            return str.endsWith(front);
        } else {
            return false;
        }
    }

    @Override
    public String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA == 0 || lengthB == 0){
            return "";
        }  else {
            if (lengthA == lengthB){
                return a + b;
            } else if (lengthA > lengthB) {
                return a.substring(lengthA - lengthB) + b;
            } else {
                return a + b.substring(lengthB - lengthA);
            }
        }
    }
}
