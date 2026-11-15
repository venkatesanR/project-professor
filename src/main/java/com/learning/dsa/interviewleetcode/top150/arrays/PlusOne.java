package com.learning.dsa.interviewleetcode.top150.arrays;

public class PlusOne {
    public int[] plusOne(int[] nums) {
        if (nums == null || nums.length == 0) return nums;

        int carry = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = nums[i] + carry;
            if (i == nums.length - 1) {
                sum += 1;
            }

            carry = sum <= 9 ? 0 : sum / 10;
            int data = sum <= 9 ? sum : sum % 10;
            nums[i] = data;
            if (carry == 0) {
                break;
            }
        }

        if (carry == 0) {
            return nums;
        }
        int[] result = new int[nums.length + 1];
        result[0] = carry;
        System.arraycopy(nums, 0, result, 1, nums.length);
        return result;
    }
}
