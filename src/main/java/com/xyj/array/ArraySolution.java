package com.xyj.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 数组算法题
 */
public class ArraySolution {
    /**
     * 删除有序序列中的重复元素
     * 时间复杂度O(n)，空间复杂度O(1)
     *
     * @param nums 有序数组
     * @return 不重复元素数量
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    /**
     * 删除有序序列中的重复元素（最多只能重复一次）
     * 时间复杂度O(n)，空间复杂度O(1)
     *
     * @param nums 有序数组
     * @return 元素数量
     */
    public int removeDuplicates2(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    /**
     * { 100, 4, 200, 1, 3, 2, 5, 6, 8, 99, 150 }
     * num=100 length=2
     * num=4 length=6
     * num=200 length=1
     * num=150 length=1
     * 获取最长连续序列的个数
     * 时间复杂度 O(n)，空间复杂度 O(n)
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            int length = 1;
            for (int i = num + 1; set.contains(i); i++) {
                set.remove(i);
                length++;
            }
            for (int i = num - 1; set.contains(i); i--) {
                set.remove(i);
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }

    /**
     * 时间复杂度O(n^2)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }

    /**
     * 时间复杂度O(n) 空间复杂度S(n)
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer j = map.get(target - nums[i]);
            if (j != null) {
                return new int[]{i+1, j+1};
            }
        }
        return null;
    }
}
