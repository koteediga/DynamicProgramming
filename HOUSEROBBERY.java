class Solution {
    public int cost(int i,int[] nums,int n,int[] dp){
        if(n==0) return nums[n];
        if(n==1) return Math.max(nums[1],nums[0]);
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+cost(i,nums,n-2,dp);
        int notpick=0+cost(i,nums,n-1,dp);
        int r=Math.max(pick,notpick);
        dp[n]=r;
        return r;

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int r=cost(0,nums,n-1,dp);
        return r;
    }
}
