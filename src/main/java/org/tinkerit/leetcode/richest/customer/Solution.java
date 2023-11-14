package org.tinkerit.leetcode.richest.customer;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            if (maxWealth < total) {
                maxWealth = total;
            }
        }
        return maxWealth;
    }
}
