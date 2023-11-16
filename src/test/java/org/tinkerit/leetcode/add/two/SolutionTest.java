package org.tinkerit.leetcode.add.two;

import org.junit.jupiter.api.Test;
import org.tinkerit.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    class TestSet {
        public ListNode input1;
        public ListNode input2;
        public int[] exp;
        public TestSet(int[] input1, int[] input2, int[] exp) {
            this.input1 = build(input1);
            this.input2 = build(input2);
            this.exp = exp;
        }
    }

    private ListNode build(int[] input) {
        ListNode head = new ListNode(input[0]);
        ListNode node = head;
        for (int i = 1; i < input.length; i ++) {
            node.next = new ListNode(input[i]);
            node = node.next;
        }
        return head;
    }

    private final Solution solution = new Solution();

    @Test
    void middleNode() {
        TestSet[] tests = new TestSet[]{
            new TestSet(new int[]{2,4,3}, new int[]{5,6,4}, new int[]{7,0,8}),
            new TestSet(new int[]{2,4,3,6}, new int[]{5,6,4}, new int[]{7,0,8,6}),
            new TestSet(new int[]{9}, new int[]{1,9,9,9,9,9,9,9,9,9}, new int[]{0,0,0,0,0,0,0,0,0,0,1}),
            new TestSet(new int[]{0}, new int[]{0}, new int[]{0}),
        };
        for (TestSet test: tests) {
            ListNode node = solution.addTwoNumbers(test.input1, test.input2);
            assertArrayEquals(test.exp, node.visitNodes());
        }
    }
}