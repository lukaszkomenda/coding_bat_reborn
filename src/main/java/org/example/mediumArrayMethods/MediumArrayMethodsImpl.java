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
}
