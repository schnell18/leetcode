package org.tinkerit.leetcode.add.two;

import org.tinkerit.leetcode.common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        int val1 = 0;
        int val2 = 0;
        ListNode head = new ListNode();
        ListNode current = head;

        while (true) {
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            else {
                val1 = 0;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            else {
                val2 = 0;
            }
            current.val = (val1 + val2 + carryOver) % 10;
            carryOver = (val1 + val2 + carryOver) / 10;
            if (l1 != null || l2 != null || carryOver > 0) {
                current.next = new ListNode();
                current = current.next;
            }
            else {
                break;
            }
        }
        return head;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        // combine digits into integers
//        // add two integers
//        int sum = combineDigits(l1) + combineDigits(l2);
//        if (sum == 0) {
//            return new ListNode(0);
//        }
//        // split digits and make ListNode
//        ListNode head = new ListNode(sum % 10);
//        ListNode current = head;
//        sum /= 10;
//        while (sum > 0) {
//            current.next = new ListNode(sum % 10);
//            sum /= 10;
//            current = current.next;
//        }
//        return head;
//    }

//    private int combineDigits(ListNode l1) {
//        int digit = 0;
//        int result = 0;
//        while (l1 != null) {
//            int result1 = 1;
//            for (int i = 0; i < digit; i++) {
//                result1 *= 10;
//            }
//            result += l1.val * result1;
//           l1 = l1.next;
//           digit ++;
//        }
//        return result;
//    }
//
}
