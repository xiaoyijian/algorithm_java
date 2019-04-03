package com.xyj.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author xiaoyijian
 * @date 2019/04/03
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ArrayTest {

    @Test
    public void removeDuplicates() {
        Solution1 solution1 = new Solution1();
        int[] arr1 = { 1, 1, 2, 2, 3 };
        int length = solution1.removeDuplicates(arr1);
        Assert.assertEquals(3, length);
        Assert.assertArrayEquals(new int[] { 1, 2, 3 }, Arrays.copyOf(arr1, length));
    }
}
