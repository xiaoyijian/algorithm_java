package com.xyj.array;

/**
 * Remove Duplicates from Sorted Array II
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
 * For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5, and A is now [1,1,2,2,3]
 *
 * Created by xiaoyijian on 2017/7/28.
 */
public class Solution2 {
    // Time complexity: O(n), Space Complexity: O(1)
    public int removeDuplicates(int[] nums) {
        if (nums.length <=2) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    // 1,1,1,2,2,3
    // i=2 index=2
    // i=3 index=2 nums[2]=nums[3] index=3
    // i=4 index=3 nums[3]=nums[4] index=4
    // i=5 index=4 nums[4]=nums[5] index=5

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] arr1 = {1,1,1,2,2,3};
        int length = solution2.removeDuplicates(arr1);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
