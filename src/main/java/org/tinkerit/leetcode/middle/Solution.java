package org.tinkerit.leetcode.middle;

import org.tinkerit.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> visited = new ArrayList<>();
        visited.add(head);
        while (visited.get(visited.size()-1).next != null) {
            visited.add(visited.get(visited.size()-1).next );
        }
        return visited.get(visited.size() / 2);
    }

    public ListNode middleNode2(ListNode head) {
        ListNode node = head;
        int size = 0;
        while (node != null) {
            size ++;
            node = node.next;
        }

        int i = size / 2;
        node = head;
        while (i > 0) {
            i --;
            node = node.next;
        }
        return node;
    }
    public ListNode middleNode3(ListNode head) {
        ListNode end = head;
        ListNode middle = head;
        while (end != null && end.next != null) {
            end = end.next.next;
            middle = middle.next;
        }

        return middle;
    }
}
