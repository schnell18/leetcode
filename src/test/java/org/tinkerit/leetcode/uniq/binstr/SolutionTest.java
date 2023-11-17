package org.tinkerit.leetcode.uniq.binstr;

import org.junit.jupiter.api.Test;
import org.tinkerit.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    class TestSet {
        public String[] input;
        public String[] exp;
        public TestSet(String[] input, String[] exp) {
            this.input = input;
            this.exp = exp;
        }
    }
    private final Solution solution = new Solution();

    private final TestSet[] tests = new TestSet[]{
        new TestSet(new String[]{"01", "10"}, new String[]{"00", "11"}),
        new TestSet(new String[]{"00", "01"}, new String[]{"11", "10"}),
        new TestSet(new String[]{"111", "011", "101"}, new String[]{"001", "000", "100", "110", "010"}),
    };

    @Test
    void findDifferentBinaryString() {
        for (TestSet test: tests) {
            String ret = solution.findDifferentBinaryString(test.input);
            assertTrue(contains(test.exp, ret));
        }
    }

    @Test
    void findDifferentBinaryString2() {
        for (TestSet test: tests) {
            String ret = solution.findDifferentBinaryString2(test.input);
            assertTrue(contains(test.exp, ret));
        }
    }

    private static boolean contains(String[] answers, String answer) {
        for (String ans : answers) {
            if (ans.equals(answer)) {
                return true;
            }
        }
        return false;
    }

}