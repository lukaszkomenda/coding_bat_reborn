package org.example.mediumArrayMethods;

public class MediumArrayMethodsImpl implements MediumArrayMethods{
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

        while(i < nums.length) {
            if(nums[i] == 13) {
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
        if (nums.length <= 1){
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2){
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
}
