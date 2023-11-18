package org.tinkerit.leetcode.triple.palindrom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    class TestSet {
        public String input;
        public int exp;
        public TestSet(String input, int exp) {
            this.input = input;
            this.exp = exp;
        }
    }
    private final Solution solution = new Solution();

    private final TestSet[] tests = new TestSet[]{
        new TestSet("aabca", 3),
        new TestSet("adc", 0),
        new TestSet("bbcbaba", 4),
    };

    @Test
    void countPalindromicSubsequence() {
        for (TestSet test: tests) {
            int ret = solution.countPalindromicSubsequence(test.input);
            assertEquals(test.exp, ret);
        }
    }

    @Test
    void countPalindromicSubsequence2() {
        for (TestSet test: tests) {
            int ret = solution.countPalindromicSubsequence2(test.input);
            assertEquals(test.exp, ret);
        }
    }

}