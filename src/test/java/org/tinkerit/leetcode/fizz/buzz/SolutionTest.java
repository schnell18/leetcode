package org.tinkerit.leetcode.fizz.buzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    class TestSet {
        public int input;
        public List<String> exp;
        public TestSet(int input, String[] exp) {
            this.input = input;
            this.exp = Arrays.stream(exp).toList();
        }
    }

    private Solution solution = new Solution();
    @Test
    void fizzBuzz() {
        TestSet[] testSets = new TestSet[]{
            new TestSet(3, new String[] {"1", "2", "Fizz"}),
            new TestSet(5, new String[] {"1", "2", "Fizz", "4", "Buzz"}),
            new TestSet(15, new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"}),
        };
        for (TestSet testSet: testSets) {
            List<String> ret = solution.fizzBuzz(testSet.input);
            System.out.println(ret);
            assertLinesMatch(testSet.exp, ret);
        }
    }
}