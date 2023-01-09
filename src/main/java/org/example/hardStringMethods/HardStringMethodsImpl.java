package org.example.hardStringMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HardStringMethodsImpl implements HardStringMethods{
    @Override
    public int countYZ(String str) {
        if(str.length() == 0)
            return 0;

        int count = 0;

        for(int i = 0; i <= str.length() - 2; i++) {
            if((Character.toLowerCase(str.charAt(i)) == 'y' ||
                    Character.toLowerCase(str.charAt(i)) == 'z') &&
                    !Character.isLetter(str.charAt(i+1)))
                count++;
        }

        char lowerCaseChar = Character.toLowerCase(str.charAt(str.length() - 1));

        if(lowerCaseChar == 'y' || lowerCaseChar == 'z')
            count++;

        return count;
    }

    @Override
    public String withoutString(String base, String remove) {

        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;

        while(i <= base.length() - remove.length()) {
            if(base.substring(i, i + remove.length()).equalsIgnoreCase(
                    remove)) {
                i += remove.length();
            } else {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }

        while(i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }

        return new String(arr, 0, count);
    }

    @Override
    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        Pattern isPattern = Pattern.compile("is");
        Matcher isMatcher = isPattern.matcher(str);

        while (isMatcher.find()){
            isCount++;
        }

        Pattern notPattern = Pattern.compile("not");
        Matcher notMatcher = notPattern.matcher(str);

        while (notMatcher.find()) {
            notCount++;
        }

        return isCount == notCount;
    }

    @Override
    public boolean gHappy(String str) {

        if(str.length() == 1 && str.charAt(0) == 'g')
            return false;

        if(str.length() >= 2 &&
                (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
                        str.charAt(str.length()-1) == 'g' &&
                                str.charAt(str.length()-2) != 'g'))
            return false;

        for(int i = 1; i <= str.length() - 2; i++) {
            if(str.charAt(i) == 'g' && str.charAt(i-1) != 'g' &&
                    str.charAt(i+1) != 'g')
                return false;
        }

        return true;
    }

    @Override
    public int countTriple(String str) {
        int count = 0;

        for(int i = 0; i <= str.length() - 3; i++) {
            if(str.charAt(i) == str.charAt(i+1) &&
                    str.charAt(i) == str.charAt(i+2))
                count++;
        }

        return count;
    }

    @Override
    public int sumDigits(String str) {
        int counter = 0;
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            if (Character.isDigit(strArray[i])) {
                counter += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return counter;
    }

    @Override
    public String sameEnds(String string) {
        int start = (int) Math.ceil((double) string.length() / 2);
        int end = string.length() / 2;

        for(int i = 0; i < string.length() / 2; i++) {
            if(string.substring(0, end).equals(string.substring(start))) {
                return string.substring(0, end);
            } else {
                start++;
                end--;
            }
        }
        return "";
    }

    @Override
    public String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == string.charAt(string.length() - i - 1))
                result.append(string.charAt(i));
            else
                break;
        }

        return result.toString();
    }

    @Override
    public int sumNumbers(String str) {
        int sum = 0;
        int i = 0;
        int begin;
        int end;

        while(i < str.length() && !Character.isDigit(str.charAt(i)))
            i++;

        begin = i;
        end = i;

        while(i < str.length()) {
            if(!Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(begin, end));
                while(i < str.length() && !Character.isDigit(str.charAt(i)))
                    i++;

                begin = i;
                end = i;
            } else {
                end++;
                i++;
            }
        }

        if(end > begin)
            sum += Integer.parseInt(str.substring(begin, end));

        return sum;
    }

    @Override
    public int maxBlock(String str) {
        if(str.length() == 0)
            return 0;

        int largest = 0;
        int current = 1;

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                if(current > largest)
                    largest = current;
                current = 1;
            } else {
                current++;
            }
        }

        return Math.max(largest, current);
    }

    @Override
    public String notReplace(String str) {
        if(str.equals("is"))
            return "is not";

        StringBuilder result = new StringBuilder();
        int i = 0;

        if(str.length() >= 3 && str.startsWith("is") &&
                !Character.isLetter(str.charAt(2))) {
            result.append("is not");
            i = 2;
        }

        while(i < str.length()) {
            if(!Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i));
                i++;
            } else if(i >= 1 && i <= str.length()-3 &&
                    !Character.isLetter(str.charAt(i-1)) &&
                    str.startsWith("is", i) &&
                    !Character.isLetter(str.charAt(i+2))) {
                result.append("is not");
                i += 2;
            } else if(i >= 1 && !Character.isLetter(str.charAt(i-1)) &&
                    str.substring(i).equals("is")) {
                result.append("is not");
                i += 2;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
