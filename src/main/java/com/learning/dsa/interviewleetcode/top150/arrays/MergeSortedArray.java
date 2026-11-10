package com.learning.dsa.interviewleetcode.top150.arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0) {
            return;
        }

        int traceLocation = m + n - 1;
        int leftPointer = m - 1;
        int rightPointer = n - 1;

        while (rightPointer >= 0) {
            int copyValue = (leftPointer >= 0 && nums1[leftPointer] > nums2[rightPointer])
                    ? nums1[leftPointer--] : nums2[rightPointer--];
            nums1[traceLocation--] = copyValue;
        }
    }
}
