package org.tinkerit.leetcode.middle;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    int[] visitNodes() {
       int size = 0;
       ListNode node = this;
       while (node != null) {
        size ++;
        node = node.next;
       }
       int[] rets = new int[size];
       node = this;
       int i = 0;
       while (node != null) {
        rets[i++] = node.val;
        node = node.next;
       }
       return rets;
    }
}