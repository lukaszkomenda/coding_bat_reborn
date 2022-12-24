package org.example.stringMethods;

public class StringMethodsImpl implements StringMethods{
    @Override
    public String doubleChar(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }

        return newStr.toString();
    }

    @Override
    public int countHi(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)){
                counter++;
            }
        }
        return counter;
    }
}
