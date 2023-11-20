package org.tinkerit.leetcode.ball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    class TestSet {
        public String input;
        public long exp;
        public TestSet(String input, long exp) {
            this.input = input;
            this.exp = exp;
        }
    }
    private final Solution solution = new Solution();

    private final TestSet[] tests = new TestSet[]{
        new TestSet("0101010", 6),
        new TestSet("100", 2),
        new TestSet("000101010", 6),
    };

    @Test
    void minimumSteps() {
        for (TestSet test: tests) {
            long ret = solution.minimumSteps(test.input);
            assertEquals(test.exp, ret);
        }
    }

}