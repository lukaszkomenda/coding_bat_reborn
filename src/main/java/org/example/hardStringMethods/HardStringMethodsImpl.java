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
}
