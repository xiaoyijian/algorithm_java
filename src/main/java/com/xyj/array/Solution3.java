package com.xyj.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Consecutive Sequence
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 *
 * Created by xiaoyijian on 2017/7/28.
 */
public class Solution3 {
    // Time Complexity: O(n)，Space Complexity: O(n)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            int length = 1;
            for (int i = num+1; set.contains(i); i++) {
                set.remove(i);
                length++;
            }
            for (int i = num-1; set.contains(i); i--) {
                set.remove(i);
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }


    public static void main(String[] args) {
        Solution3 solution2 = new Solution3();
        int[] arr1 = {100, 4, 200, 1, 3, 2, 5, 6, 8, 99, 150};
        int length = solution2.longestConsecutive(arr1);
        System.out.println(length);
    }
}
