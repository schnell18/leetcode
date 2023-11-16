package org.tinkerit.leetcode.palindrome.number;

import org.tinkerit.leetcode.common.Utils;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int[] digits = new int[10];
        int z = x;
        int i = 0;
        while (z > 0) {
            digits[i++] = z % 10;
            z /= 10;
        }
        i = i - 1;
        int y = 0;
        for (int j = i; j >= 0; j--) {
            y += digits[j] * Utils.pow(10, i - j);
        }

        return x == y;
    }

}