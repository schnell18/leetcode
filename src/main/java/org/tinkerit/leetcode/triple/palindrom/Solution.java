package org.tinkerit.leetcode.triple.palindrom;

import java.util.*;

public class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        List<String> heads = new ArrayList<>();
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++) {
            if (heads.contains(chars[i])) {
                continue;
            }
            for (int j = chars.length - 1; j >= 0; j--) {
                if (i != j && chars[i].equals(chars[j])) {
                    map.clear();
                    for (int k = i+1; k <= j-1 ; k++) {
                        map.put(chars[k], 1);
                    }
                    count += map.size();
                    heads.add(chars[i]);
                    break;
                }
            }
        }

        return count;
    }
    public int countPalindromicSubsequence2(String s) {
        boolean[] visited = new boolean[128];
        boolean[] seen = new boolean[128];
        int count = 0;
        Arrays.fill(seen, false);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (visited[chars[i]]) {
                continue;
            }
            for (int j = chars.length - 1; j >= 0; j--) {
                if (i != j && chars[i] == chars[j]) {
                    Arrays.fill(seen, false);
                    int t = 0;
                    for (int k = i+1; k < j ; k++) {
                        if (!seen[chars[k]]) {
                            seen[chars[k]] = true;
                            t ++;
                        }
                    }
                    count += t;
                    visited[chars[i]] = true;
                    break;
                }
            }
        }

        return count;
    }
}
