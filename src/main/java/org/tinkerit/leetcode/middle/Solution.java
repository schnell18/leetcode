package org.tinkerit.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> visited = new ArrayList();
        visited.add(head);
        while (visited.get(visited.size()-1).next != null) {
            visited.add(visited.get(visited.size()-1).next );
        }
        return visited.get(visited.size() / 2);
    }
}
