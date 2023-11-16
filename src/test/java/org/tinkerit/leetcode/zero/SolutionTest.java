package org.tinkerit.leetcode.zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    class TestSet {
        public int input;
        public int exp;

        public TestSet(int input, int exp) {
            this.input = input;
            this.exp = exp;
        }
    }

    private final Solution solution = new Solution();

    @Test
    void numberOfSteps() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(14, 6),
            new TestSet(8, 4),
            new TestSet(123, 12),
        };
        for (TestSet test : testSets) {
            int ret = solution.numberOfSteps(test.input);
            assertEquals(test.exp, ret);
        }
    }

    @Test
    void numberOfStepsBitOps() {
        TestSet[] testSets = new TestSet[]{
                new TestSet(14, 6),
                new TestSet(8, 4),
                new TestSet(123, 12),
        };
        for (TestSet test : testSets) {
            int ret = solution.numberOfStepsBitOps(test.input);
            assertEquals(test.exp, ret);
        }
    }

}