package com.learning.dsa.interviewleetcode.top150.arrays;

import java.util.Arrays;

/**
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 *
 * Return k.
 * Custom Judge:
 */
public class RemoveElementArray {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int startIdentifier = -1;
        int actualCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < val) {
                actualCounter += 1;
                continue;
            }
            if (nums[i] == val && startIdentifier == -1) {
                startIdentifier = i;
            }
            if (nums[i] > val) {
                if (startIdentifier >= 0 && startIdentifier < nums.length) {
                    nums[startIdentifier] = nums[i];
                    startIdentifier += 1;
                }
                actualCounter += 1;
            }
        }
        return actualCounter;
    }
}
