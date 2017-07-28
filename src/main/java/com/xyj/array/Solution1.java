package com.xyj.array;

/**
 * Remove Duplicates from Sorted Array
 * 描述
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 * Created by xiaoyijian on 2017/7/28.
 */
public class Solution1 {
    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr1 = {1,1,2,2,3};
        int length = solution1.removeDuplicates(arr1);
        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}
