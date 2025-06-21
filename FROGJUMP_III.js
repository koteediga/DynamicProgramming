import java.util.Arrays;

class Solution {
    public int jumping(int[] heights, int k, int[] dp, int n) {
        if (n == 0) return 0;
        if (n == 1) return Math.abs(heights[1] - heights[0]);

        if (dp[n] != -1) return dp[n];

        int r1 = Math.abs(heights[n] - heights[n - 1]) + jumping(heights, k, dp, n - 1);
        int r2 = Integer.MAX_VALUE;

        if (n - k >= 0) {
            r2 = Math.abs(heights[n] - heights[n - k]) + jumping(heights, k, dp, n - k);
        }

        dp[n] = Math.min(r1, r2);
        return dp[n];
    }

    public int frogJump(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return jumping(heights, k, dp, n - 1);
    }
}
