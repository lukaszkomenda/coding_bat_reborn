package org.example.hardStringMethods;

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
}
