package org.example.mediumRecursionMethods;

public class MediumRecursionMethodsImpl implements MediumRecursionMethods{
    @Override
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupSum(start + 1, nums, target - nums[start])) return true;

        return groupSum(start + 1, nums, target);
    }

    @Override
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(nums[start] == 6)
            return groupSum6(start+1, nums, target - 6);

        if(groupSum6(start+1, nums, target - nums[start]))
            return true;

        return groupSum6(start + 1, nums, target);
    }

    @Override
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(groupNoAdj(start+2, nums, target - nums[start]))
            return true;

        return groupNoAdj(start + 1, nums, target);
    }

    @Override
    public boolean groupSum5(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(nums[start] % 5 == 0) {
            if(start <= nums.length - 2 && nums[start+1] == 1)
                return groupSum5(start+2, nums, target - nums[start]);

            return groupSum5(start+1, nums, target - nums[start]);
        }

        if(groupSum5(start+1, nums, target - nums[start]))
            return true;

        return groupSum5(start + 1, nums, target);
    }
}
