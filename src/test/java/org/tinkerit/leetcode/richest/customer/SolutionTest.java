package org.tinkerit.leetcode.richest.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    class TestSet {
        public int[][] input;
        public int exp;
        public TestSet(int[][] input, int exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private Solution solution = new Solution();

    @Test
    void maximumWealth() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6),
            new TestSet(new int[][]{{1, 5},{7, 3}, {3, 5}}, 10),
            new TestSet(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9,5}}, 17),
        };
        for (TestSet testSet: testSets) {
            int ret = solution.maximumWealth(testSet.input);
            assertEquals(testSet.exp, ret);
        }
    }
}