package org.tinkerit.leetcode.runnning.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    class TestSet {
        public int[] input;
        public int[] exp;
        public TestSet(int[] input, int[] exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private Solution solution = new Solution();

    @Test
    void runningSum() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(new int[]{}, new int[]{}),
            new TestSet(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
            new TestSet(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestSet(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17}),
        };
        for (TestSet testSet: testSets) {
            int[] rets = solution.runningSum(testSet.input);
            assertArrayEquals(testSet.exp, rets);
        }
    }
}