package com.xyj.array;

import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author xiaoyijian
 * @date 2019/04/03
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ArrayTest {

    private ArraySolution arraySolution = new ArraySolution();

    @Test
    public void removeDuplicates() {
        int[] arr1 = { 1, 1, 2, 2, 3 };
        int length = arraySolution.removeDuplicates(arr1);
        assertEquals(3, length);
        assertArrayEquals(new int[] { 1, 2, 3 }, Arrays.copyOf(arr1, length));
    }

    @Test
    public void removeDuplicates2() {
        int[] arr1 = { 1, 1, 2, 2, 2, 3 };
        int length = arraySolution.removeDuplicates2(arr1);
        assertEquals(5, length);
        assertArrayEquals(new int[] { 1, 1, 2, 2, 3 }, Arrays.copyOf(arr1, length));
    }

    @Test
    public void longestConsecutive() {
        int[] arr1 = { 100, 4, 200, 1, 3, 2, 5, 6, 8, 99, 150 };
        int length = arraySolution.longestConsecutive(arr1);
        assertEquals(6, length);
    }

    @Test
    public void twoSum() {
        int[] nums = { 2, 7, 5, 3, 9 };
        int target = 9;

        int[] result1 = arraySolution.twoSum(nums, target);
        int[] result2 = arraySolution.twoSum2(nums, target);

        assertArrayEquals(new int[] { 1, 2 }, result1);
        assertArrayEquals(new int[] { 1, 2 }, result2);
    }

}
