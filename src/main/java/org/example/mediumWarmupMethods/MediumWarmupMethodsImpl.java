package org.example.mediumWarmupMethods;

public class MediumWarmupMethodsImpl implements MediumWarmupMethods{
    @Override
    public String stringTimes(String str, int n) {
        return String.valueOf(str).repeat(Math.max(0, n));
    }

    @Override
    public String frontTimes(String str, int n) {
        int frontLen = 3;

        if (frontLen > str.length()){
            frontLen = str.length();
        }

        String front = str.substring(0,frontLen);

        return front.repeat(Math.max(0, n));
    }

    @Override
    public int countXX(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("xx", i)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean doubleX(String str) {
        int xIndex = str.indexOf("x");

        if (xIndex == -1){
            return false;
        }

        if (xIndex + 1 >= str.length()){
            return false;
        }

        return str.charAt(xIndex + 1) == 'x';
    }

    @Override
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i+=2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    @Override
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);
        }

        return result.toString();
    }

    @Override
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() -2; i++) {
            String sub = str.substring(i, i+2);

            if (sub.equals(end)){
                count++;
            }
        }
        return count;
    }

    @Override
    public int arrayCount9(int[] nums) {
        int counter = 0;

        for (int num : nums) {
            if (num == 9) counter++;
        }

        return counter;
    }

    @Override
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    @Override
    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }

    @Override
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);

            if (aSub.equals(bSub)) count++;
        }
        return count;
    }

    @Override
    public String stringX(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')){
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    @Override
    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i+=4) {
            int end = i +2;

            if (end > str.length()){
                end = str.length();
            }
            result.append(str, i, end);
        }
        return result.toString();
    }

    @Override
    public String stringYak(String str) {
        if (str.contains("yak")){
            return str.replace("yak", "");
        }
        return str;
    }

    @Override
    public int array667(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 6){
                if (nums[i+1] == 6 || nums[i+1] == 7){
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];

            if (nums[i+1] == first && nums[i+2] == first) return false;
        }
        return true;
    }

    @Override
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];

            if (nums[i+1] == (value + 5) && Math.abs(nums[i+2] - (value -1)) <=2){
                return true;
            }
        }
        return false;
    }


}
