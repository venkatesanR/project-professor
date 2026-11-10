package com.learning.dsa.interviewleetcode.top150.arrays;

public class MajorityElementInArray {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int voteCount = 0;
        for (int num : nums) {
            if (voteCount == 0) {
                candidate = num;
                voteCount = 1;
            } else if (candidate == num) {
                voteCount += 1;
            } else {
                voteCount -= 1;
            }
        }
        voteCount = 0;
        for (int num : nums) {
            if (candidate == num) {
                voteCount += 1;
            }
        }
        return voteCount >= nums.length / 2 ? candidate : -1;
    }
}
