package org.tinkerit.leetcode.ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> ransomNoteMap = buildMap(ransomNote);
        Map<String, Integer> magazineMap = buildMap(magazine);
        for (Map.Entry<String, Integer> entry: ransomNoteMap.entrySet()) {
            Integer dictCount = magazineMap.get(entry.getKey());
            if (dictCount == null || dictCount < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private Map<String, Integer> buildMap(String str) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String letter : str.split("")) {
            resultMap.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }
        return resultMap;
    }
}
