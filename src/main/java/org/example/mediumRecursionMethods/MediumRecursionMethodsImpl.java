package org.example.mediumRecursionMethods;

public class MediumRecursionMethodsImpl implements MediumRecursionMethods {
    @Override
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupSum(start + 1, nums, target - nums[start])) return true;

        return groupSum(start + 1, nums, target);
    }

    @Override
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (nums[start] == 6)
            return groupSum6(start + 1, nums, target - 6);

        if (groupSum6(start + 1, nums, target - nums[start]))
            return true;

        return groupSum6(start + 1, nums, target);
    }

    @Override
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupNoAdj(start + 2, nums, target - nums[start]))
            return true;

        return groupNoAdj(start + 1, nums, target);
    }

    @Override
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (nums[start] % 5 == 0) {
            if (start <= nums.length - 2 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);

            return groupSum5(start + 1, nums, target - nums[start]);
        }

        if (groupSum5(start + 1, nums, target - nums[start]))
            return true;

        return groupSum5(start + 1, nums, target);
    }

    @Override
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        int i = start;
        int sum = 0;

        while (i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }

        if (groupSumClump(i, nums, target - sum))
            return true;

        return groupSumClump(i, nums, target);
    }

    @Override
    public boolean splitArray(int[] nums) {

        return splitArrayHelper(0, nums, 0, 0);

    }

    public boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
        if (start >= nums.length)
            return group1 == group2;

        if (splitArrayHelper(start + 1, nums, group1 + nums[start], group2))
            return true;

        return splitArrayHelper(start + 1, nums, group1, group2 + nums[start]);
    }
}
