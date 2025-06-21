import java.util.Arrays;

class Solution {
    public int cost(int[] dp, int[] heights, int n) {
        if (n == 0) return 0;
        if (n == 1) return Math.abs(heights[1] - heights[0]);

        if (dp[n] != -1) return dp[n];

        int r1 = Math.abs(heights[n] - heights[n - 1]) + cost(dp, heights, n - 1);
        int r2 = Math.abs(heights[n] - heights[n - 2]) + cost(dp, heights, n - 2);

        dp[n] = Math.min(r1, r2);
        return dp[n];
    }

    public int frogJump(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return cost(dp, heights, n - 1);
    }
}
