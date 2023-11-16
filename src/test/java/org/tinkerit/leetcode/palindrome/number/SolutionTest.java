package org.tinkerit.leetcode.palindrome.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    class TestSet {
        public int input;
        public boolean exp;

        public TestSet(int input, boolean exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private final Solution solution = new Solution();
    @Test
    void isPalindrome() {
        TestSet[] tests = new TestSet[] {
                new TestSet(121, true),
                new TestSet(-121, false),
                new TestSet(10, false),
                new TestSet(122, false),
                new TestSet(1221, true),
        };

        for (TestSet test: tests) {
            boolean ret = solution.isPalindrome(test.input);
            assertEquals(test.exp, ret);
        }
    }
}