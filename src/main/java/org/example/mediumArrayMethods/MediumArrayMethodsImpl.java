package org.example.mediumArrayMethods;


public class MediumArrayMethodsImpl implements MediumArrayMethods {
    @Override
    public int countEvens(int[] nums) {
        int counter = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

    @Override
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (sum - min - max) / (nums.length - 2);
    }

    @Override
    public int sum13(int[] nums) {
        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }

        return sum;
    }

    @Override
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inRange = false;

        for (int num : nums) {
            if (num == 6)
                inRange = true;

            if (!inRange)
                sum += num;

            if (inRange && num == 7)
                inRange = false;

        }

        return sum;
    }

    @Override
    public boolean has22(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean sum28(int[] nums) {
        int counter = 0;

        for (int num : nums) {
            if (num == 2) {
                counter += num;
            }
        }
        return counter == 8;
    }

    @Override
    public boolean more14(int[] nums) {
        int counterFour = 0;
        int counterOne = 0;

        for (int num : nums) {
            if (num == 4) {
                counterFour++;
            } else if (num == 1) {
                counterOne++;
            }
        }
        return counterFour < counterOne;
    }

    @Override
    public int[] fizzArray(int n) {
        if (n == 0) {
            return new int[0];
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }

    @Override
    public boolean only14(int[] nums) {

        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String[] fizzArray2(int n) {
        if (n == 0){
            return new String[0];
        }
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
        }

        return array;
    }

    @Override
    public boolean no14(int[] nums) {

        int countOne = 0;
        int countFour = 0;

        if(nums.length == 0){
            return true;
        } else if(nums.length == 1){
            return true;
        }

        for (int num : nums) {
            if (num == 1){
                countOne++;
            }
            if (num == 4){
                countFour++;
            }
        }

        if (countOne >= 1 && countFour == 0){
            return true;
        } else return countOne == 0 && countFour >= 1;
    }

    @Override
    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != val && nums[i + 1] != val)
                return false;
        }

        return true;
    }

    @Override
    public boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i+1] == 2)
                has22 = true;

            if(nums[i] == 4 && nums[i+1] == 4)
                has44 = true;
        }

        return has22 != has44;
    }

    @Override
    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] >= nums2[i]){
                if (nums1[i] - nums2[i] <= 2 && nums1[i] - nums2[i] != 0){
                    counter++;
                }
            } else {
                if (nums2[i] - nums1[i] <= 2 && nums2[i] - nums1[i] != 0){
                    counter++;
                }
            }
        }

        return counter;
    }

    @Override
    public boolean has77(int[] nums) {
        if (nums.length <= 1){
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i+1] == 7){
                return true;
            }
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 2] == 7){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean has12(int[] nums) {

        int countOne = 0;
        int countTwo = 0;
        int positionOne = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                countOne++;
                positionOne = i;
            }
        }

        for (int i = positionOne; i < nums.length; i++) {
            if (nums[i] == 2){
                countTwo++;
            }
        }
        return countOne > 0 & countTwo > 0;
    }

    @Override
    public boolean modThree(int[] nums) {
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0){
                counterEven++;
            } else if (nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0) {
                counterOdd++;
            }
        }
        return counterEven >= 1 || counterOdd >= 1;
    }

    @Override
    public boolean haveThree(int[] nums) {

        int counterThree = 0;

        for (int num : nums) {
            if (num == 3) {
                counterThree++;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3){
                counterThree--;
            }
        }

        return counterThree == 3;
    }

    @Override
    public boolean twoTwo(int[] nums) {
        if(nums.length == 1 && nums[0] == 2)
            return false;

        if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
                (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
            return false;

        for(int i = 1; i <= nums.length - 2; i++) {
            if(nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2)
                return false;
        }

        return true;
    }

    @Override
    public boolean sameEnds(int[] nums, int len) {
        int[] pattern = new int[len];
        int counter = 0;
        int iterator = 0;

        System.arraycopy(nums, 0, pattern, 0, pattern.length);

        for (int i = nums.length - len; i < nums.length; i++) {
            if (pattern[iterator] == nums[i]){
                counter++;
                iterator++;
            }
        }

        return counter >= len;
    }

    @Override
    public boolean tripleUp(int[] nums) {

        for(int i = 0; i <= nums.length - 3; i++) {
            if(nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2])
                return true;
        }

        return false;
    }

    @Override
    public int[] fizzArray3(int start, int end) {
        int[] array = new int[end - start];

        for (int i = 0; i < array.length; i++) {
            array[i] = start;
            start++;
        }

        return array;
    }

    @Override
    public int[] shiftLeft(int[] nums) {

        if (nums.length <= 1){
            return nums;
        }
        
        int first = nums[0];
        int[] newArray = new int[nums.length];
        int iterator = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            newArray[i] = nums[i+1];
            iterator++;
        }
        newArray[iterator] = first;

        return newArray;
    }

    @Override
    public int[] tenRun(int[] nums) {
        int current;
        int i = 0;

        while(i < nums.length && nums[i] % 10 != 0)
            i++;

        if(i >= nums.length)
            return nums;

        current = nums[i];
        i++;

        while(i < nums.length) {
            if(nums[i] % 10 == 0)
                current = nums[i];
            else
                nums[i] = current;
            i++;
        }

        return nums;
    }

    @Override
    public int[] pre4(int[] nums) {
        int positionFour = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4){
                positionFour = i;
                break;
            }
        }

        int[] newArray = new int[positionFour];
        System.arraycopy(nums, 0, newArray, 0, newArray.length);

        return newArray;
    }

    @Override
    public int[] post4(int[] nums) {
        int positionFour = 0;

        if(nums.length == 0){
            return nums;
        } else if (nums.length == 1 && nums[0] == 4) {
            return new int[0];
        } else if (nums.length == 1){
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4){
                positionFour = i;
                break;
            }
        }
        int[] newArray = new int[positionFour];

        System.arraycopy(nums, 0, newArray, 0, newArray.length);

        return newArray;
    }

    @Override
    public int[] notAlone(int[] nums, int val) {

        if(nums.length <=2){
            return nums;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i-1] != nums[i] && nums[i+1] != nums[i]){
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    @Override
    public int[] zeroFront(int[] nums) {
        if(nums.length == 0)
            return nums;

        int i = 0;

        while(nums[i] == 0)
            i++;

        for(int j = i + 1; j < nums.length; j++) {
            if(nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        return nums;
    }
}
