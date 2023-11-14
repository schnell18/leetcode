package org.tinkerit.leetcode.ransomnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    class TestSet {
        public String ransomNote;
        public String magazine;
        public boolean exp;

        public TestSet(String ransomNote, String magazine, boolean exp) {
            this.ransomNote = ransomNote;
            this.magazine = magazine;
            this.exp = exp;
        }
    }

    private Solution solution = new Solution();

    @Test
    void canConstruct() {
        TestSet[] tests = new TestSet[] {
            new TestSet("a", "b", false),
            new TestSet("aa", "ab", false),
            new TestSet("aa", "aab", true),
            new TestSet("aaff", "aabfe", false),
        };
        for (TestSet test: tests) {
            boolean ret = solution.canConstruct(test.ransomNote, test.magazine);
            assertEquals(test.exp, ret);
        }
    }

}