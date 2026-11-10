package com.learning.dsa.interviewleetcode.top150.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slowPointer = 0;
        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != nums[slowPointer]) {
                slowPointer += 1;
                nums[slowPointer] = nums[fastPointer];
            }
        }
        return slowPointer + 1;
    }
}
