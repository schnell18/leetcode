package org.tinkerit.leetcode.common;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int[] visitNodes() {
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