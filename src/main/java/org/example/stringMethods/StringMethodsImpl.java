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

    @Override
    public boolean catDog(String str) {
        int catCounter = 0;
        int dogCounter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i +3).contains("cat")){
                catCounter++;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i +3).contains("dog")){
                dogCounter++;
            }
        }

        return catCounter == dogCounter;
    }

    @Override
    public int countCode(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 3; i++) {
            if(str.startsWith("co", i) && str.charAt(i + 3) == 'e')
                count++;
        }

        return count;
    }

    @Override
    public boolean endOther(String a, String b) {
        if(a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }

        return a.endsWith(b);
    }

    @Override
    public boolean xyzThere(String str) {
        if(str.startsWith("xyz"))
            return true;

        for(int i = 1; i < str.length() - 2; i++) {
            if(str.charAt(i - 1) != '.' && str.startsWith("xyz", i))
                return true;
        }

        return false;
    }
}
