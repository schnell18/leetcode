package org.tinkerit.leetcode.max.adjust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    class TestSet {
        public int[] input;
        public int exp;
        public TestSet(int[] input, int exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private Solution solution = new Solution();

    @Test
    void maximumElementAfterDecrementingAndRearranging() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(new int[]{2, 2, 1, 2, 1}, 2),
            new TestSet(new int[]{100, 1, 1000}, 3),
            new TestSet(new int[]{1, 2, 3, 4, 5}, 5),
            new TestSet(new int[]{10,9,8,7,6,5,4,3,2,1}, 10),
        };
        for (TestSet testSet: testSets) {
            int ret = solution.maximumElementAfterDecrementingAndRearranging(testSet.input);
            assertEquals(testSet.exp, ret);
        }
    }
}