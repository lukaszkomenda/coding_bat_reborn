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

    @Override
    public boolean bobThere(String str) {
        if (str.length() >= 3){
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean xyBalance(String str) {
        boolean y = false;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == 'y')
                y = true;

            if(str.charAt(i) == 'x' && !y)
                return false;
        }

        return true;
    }

    @Override
    public String mixString(String a, String b) {
        final int aLength = a.length();
        final int bLength = b.length();
        final int min = Math.min(aLength, bLength);
        final StringBuilder sb = new StringBuilder(aLength + bLength);

        for (int i = 0; i < min; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }

        if (aLength > bLength){
            sb.append(a, bLength, aLength);
        } else if (aLength < bLength){
            sb.append(b, aLength, bLength);
        }
        return sb.toString();
    }

    @Override
    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String pattern = str.substring(str.length() - n);

        sb.append(pattern.repeat(Math.max(0, n)));
        return sb.toString();
    }

    @Override
    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        int limit = n;

        for (int i = 0; i < n; i++) {
            sb.append(str, 0, limit);
            limit--;
        }
        return sb.toString();
    }

    @Override
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(word);
            sb.append(sep);
        }
        return sb.substring(0, sb.length() - sep.length());
    }

    @Override
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);

        return str.substring(n).contains(prefix);
    }

    @Override
    public boolean xyzMiddle(String str) {
        if(str.length() < 3)
            return false;

        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;
        boolean isXyzAppear = str.startsWith("xyz", start2);

        if(str.length() % 2 == 0) {
            return str.startsWith("xyz", start1) ||
                    isXyzAppear;
        }

        return isXyzAppear;
    }

    @Override
    public String getSandwich(String str) {
        int first = -1;
        int last = -1;

        for(int i = 0; i < str.length() - 5; i++) {
            if(str.startsWith("bread", i)) {
                first = i;
                break;
            }
        }

        for(int i = str.length() - 5; i >= 0; i--) {
            if(str.startsWith("bread", i)) {
                last = i;
                break;
            }
        }

        if(first != -1 && last != -1 && first != last)
            return str.substring(first + 5, last);

        return "";
    }

    @Override
    public boolean sameStarChar(String str) {

        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }

        return true;
    }

    @Override
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i+=3) {
            result.append(str, i + 1, i + 3).append(str.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String zipZap(String str) {
        char[] arr = new char[str.length()];
        int count = 0;

        int i = 0;
        while(i < str.length()) {
            if(i < str.length() - 2 && str.charAt(i) == 'z' &&
                    str.charAt(i + 2) == 'p') {
                arr[count] = 'z';
                count++;
                arr[count] = 'p';
                count++;
                i += 3;
            } else {
                arr[count] = str.charAt(i);
                count++;
                i++;
            }
        }

        return new String(arr, 0, count);
    }

    @Override
    public String starOut(String str) {
        if(str.length() < 1)
            return "";

        if(str.length() == 1) {
            if(str.charAt(0) == '*')
                return "";
            else
                return str;
        }

        char[] arr = new char[str.length()];
        int count = 0;


        if(str.charAt(0) != '*' && str.charAt(1) != '*') {
            arr[count] = str.charAt(0);
            count++;
        }

        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i-1)!='*' && str.charAt(i) != '*' &&
                    str.charAt(i+1) != '*') {
                arr[count] = str.charAt(i);
                count++;
            }
        }

        if(str.charAt(str.length()-1) != '*' &&
                str.charAt(str.length()-2) != '*') {
            arr[count] = str.charAt(str.length() - 1);
            count++;
        }

        return new String(arr, 0, count);
    }

    @Override
    public String plusOut(String str, String word) {

        StringBuilder out = new StringBuilder(str);

        for (int i = 0; i < out.length(); ) {
            if (!str.startsWith(word, i))
                out.setCharAt(i++, '+');
            else
                i += word.length();
        }

        return out.toString();
    }

    @Override
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        if(str.length() >= word.length() + 1 &&
                str.startsWith(word)) {
            i = word.length() - 1;
            result.append(str.charAt(i + 1));
        }

        while(i < str.length() - word.length()) {
            if(str.substring(i + 1, i + 1 + word.length()).equals(word)) {
                result.append(str.charAt(i));
                i = i + word.length();
                if(i < str.length() - 1) {
                    result.append(str.charAt(i + 1));
                }
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
