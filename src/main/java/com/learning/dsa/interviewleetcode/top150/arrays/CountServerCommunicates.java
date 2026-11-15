package com.learning.dsa.interviewleetcode.top150.arrays;

public class CountServerCommunicates {
    public int countServers(int[][] grid) {
        int result = 0;
        if (grid.length == 0 || grid[0].length == 0) return result;

        int[] row_sum = new int[grid.length];
        int[] col_sum = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                row_sum[i] += grid[i][j];
                col_sum[j] += grid[i][j];
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && (row_sum[i] > 1 || col_sum[j] > 1)) {
                    result++;
                }
            }
        }
        return result;
    }
}
