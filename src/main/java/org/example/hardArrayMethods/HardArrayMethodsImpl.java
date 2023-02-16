package org.example.hardArrayMethods;

public class HardArrayMethodsImpl implements HardArrayMethods{
    @Override
    public int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }

    @Override
    public int[] fix34(int[] nums) {
        int i = 0;

        while(i < nums.length && nums[i] != 3)
            i++;

        int j = i + 1;

        while(j < nums.length && nums[j] != 4)
            j++;

        while(i < nums.length) {
            if(nums[i] == 3) {
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;

                while(j < nums.length && nums[j] != 4)
                    j++;
            }
            i++;
        }

        return nums;
    }

    @Override
    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;

        while(j < nums.length && nums[j] != 5)
            j++;

        while(i < nums.length) {
            if(nums[i] == 4) {
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;

                while((j < nums.length && nums[j] != 5) || j == i + 1)
                    j++;
            }
            i++;
        }

        return nums;
    }

    @Override
    public boolean canBalance(int[] nums) {
        int counter = 0;
        int countLeft = 0;
        int countRight = 0;

        for (int j : nums) {
            counter += j;
        }

        for (int num : nums) {
            if (countLeft < counter / 2) {
                countLeft += num;
            } else {
                countRight += num;
            }
        }

        return countLeft == countRight;
    }

    @Override
    public boolean linearIn(int[] outer, int[] inner) {

        int i = 0;
        int j = 0;

        while(i < inner.length && j < outer.length) {
            if(inner[i] > outer[j]) {
                j++;
            } else if(inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        return i == inner.length;
    }
}
