package com.xyj.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * Created by xiaoyijian on 2017/8/2.
 */
public class Solution4 {
    /**
     * 时间复杂度O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                count++;
                if (nums[i] + nums[j] == target) {
                    long end = System.currentTimeMillis();
                    System.out.println("运行次数："+count +" 耗时：" + (end-start));
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }

    /**
     * 时间复杂度O(n) 空间复杂度S(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        long start = System.currentTimeMillis();
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            Integer j = map.get(target - nums[i]);
            count++;
            if (j != null) {
                long end = System.currentTimeMillis();
                System.out.println("运行次数："+count +" 耗时：" + (end-start));
                return new int[] {i+1, j+1};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int index = 100;
        int[] nums = new int[index];
        for (int i = 0; i < index; i++) {
            nums[i] = i+1;
        }
        int target = index * 2 - 1;
        int[] result = solution4.twoSum(nums, target);
        int[] result2 = solution4.twoSum2(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}
