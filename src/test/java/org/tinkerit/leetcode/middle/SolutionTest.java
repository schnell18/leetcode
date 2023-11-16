package org.tinkerit.leetcode.middle;

import org.junit.jupiter.api.Test;
import org.tinkerit.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    class TestSet {
        public ListNode head;
        public int[] exp;
        public TestSet(int[] input, int[] exp) {
            head = new ListNode(input[0]);
            ListNode node = head;
            for (int i = 1; i < input.length; i ++) {
                node.next = new ListNode(input[i]);
                node = node.next;
            }
            this.exp = exp;
        }
    }

    private final Solution solution = new Solution();

    @Test
    void middleNode() {
        TestSet[] tests = new TestSet[]{
            new TestSet(new int[]{1,2,3,4,5}, new int[]{3,4,5}),
            new TestSet(new int[]{1,2,3,4,5,6}, new int[]{4,5,6}),
        };
        for (TestSet test: tests) {
            ListNode node = solution.middleNode(test.head);
            assertArrayEquals(test.exp, node.visitNodes());
        }
    }

    @Test
    void middleNode2() {
        TestSet[] tests = new TestSet[]{
                new TestSet(new int[]{1,2,3,4,5}, new int[]{3,4,5}),
                new TestSet(new int[]{1,2,3,4,5,6}, new int[]{4,5,6}),
        };
        for (TestSet test: tests) {
            ListNode node = solution.middleNode2(test.head);
            assertArrayEquals(test.exp, node.visitNodes());
        }
    }

    @Test
    void middleNode3() {
        TestSet[] tests = new TestSet[]{
                new TestSet(new int[]{1,2,3,4,5}, new int[]{3,4,5}),
                new TestSet(new int[]{1,2,3,4,5,6}, new int[]{4,5,6}),
        };
        for (TestSet test: tests) {
            ListNode node = solution.middleNode3(test.head);
            assertArrayEquals(test.exp, node.visitNodes());
        }
    }

}