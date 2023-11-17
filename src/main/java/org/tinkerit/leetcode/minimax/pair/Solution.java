package org.tinkerit.leetcode.minimax.pair;

import java.util.Arrays;

public class Solution {
    public int minPairSum(int[] nums) {
        if (nums.length % 2 == 1) {
            throw new IllegalArgumentException("Number of elements must be even");
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int pairSum = nums[i] + nums[nums.length - i - 1];
            if (max < pairSum) {
                max = pairSum;
            }
        }
        return max;
    }
}
