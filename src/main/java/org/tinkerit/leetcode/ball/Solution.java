package org.tinkerit.leetcode.ball;

class Solution {
    public long minimumSteps(String s) {
        char[] balls = s.toCharArray();
        long ops = 0;
        int black = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == '0') {
                ops += black;
            }
            else {
                black ++;
            }
        }
        return ops;

    }
}
