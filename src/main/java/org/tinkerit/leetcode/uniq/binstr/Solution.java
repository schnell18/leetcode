package org.tinkerit.leetcode.uniq.binstr;

public class Solution {
    public String findDifferentBinaryString2(String[] nums) {
        StringBuilder buf = new StringBuilder(nums.length);
        for (int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            buf.append(c == '0' ? '1' : '0');
        }
        return buf.toString();
    }

    public String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums should not be empty");
        }

        int[] ints = new int[nums.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(nums[i], 2);
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j <= nums.length; j++) {
                int candidate = ints[i] ^ j;
                if (!contains(ints, candidate)) {
                    // convert to string, left pad with 0
                    String str = Integer.toBinaryString(candidate);
                    if (str.length() < ints.length) {
                        StringBuilder buf = new StringBuilder();
                        for (int k = 0; k < ints.length - str.length(); k++) {
                            buf.append("0");
                        }
                        buf.append(str);
                        return buf.toString();
                    }
                    return str;
                }
            }
        }
        return "";
    }

    private static boolean contains(int[] answers, int answer) {
        for (int ans : answers) {
            if (ans == answer) {
                return true;
            }
        }
        return false;
    }
}
