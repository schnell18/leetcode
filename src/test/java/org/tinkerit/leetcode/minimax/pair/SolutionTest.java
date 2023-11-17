package org.tinkerit.leetcode.minimax.pair;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    class TestSet {
        public int[] input;
        public int exp;
        public TestSet(int[] input, int exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private final Solution solution = new Solution();

    @Test
    void runningSum() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(new int[]{}, 0),
            new TestSet(new int[]{1, 2, 3, 4}, 5),
            new TestSet(new int[]{3, 5, 2, 3}, 7),
            new TestSet(new int[]{3, 5, 4, 2, 4, 6}, 8),
        };
        for (TestSet testSet: testSets) {
            int ret = solution.minPairSum(testSet.input);
            assertEquals(testSet.exp, ret);
        }
    }
}