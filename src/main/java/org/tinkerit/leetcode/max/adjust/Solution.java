package org.tinkerit.leetcode.max.adjust;

import java.util.Arrays;

// solution to 1846. Maximum Element After Decreasing and Rearranging
public class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Empty Array");
        }
        Arrays.sort(arr);
        arr[0] = 1;
        // check adjacent element, decrease if necessary
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i-1] - arr[i]) > 1) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length - 1];
    }

    public int maximumElementAfterDecrementingAndRearranging2(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Empty Array");
        }
        Arrays.sort(arr);
        // check if first element is 1
        if (arr[0] != 1) {
            // find first 1 in the array and swap with first element
            int pos = -1;
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] == 1) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                arr[0] = 1;
            }
            else {
                int tmp = arr[0];
                arr[0] = arr[pos];
                arr[pos] = tmp;
            }
        }
        // check adjacent element, decrease if necessary
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i-1] - arr[i]) > 1) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length - 1];
    }

}
