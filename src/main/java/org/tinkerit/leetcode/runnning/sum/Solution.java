package org.tinkerit.leetcode.runnning.sum;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] rets = new int[nums.length];
        if (nums.length == 0) {
            return rets;
        }
        rets[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rets[i] = rets[i-1] + nums[i];
        }
        return rets;
    }
}
