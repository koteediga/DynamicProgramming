class Solution {
    public int cost(int[] nums,int i,int n,int[] dp){
           if(i>n) return 0;
           if(dp[i]!=-1) return dp[i];
           int  pick=nums[i]+cost(nums,i+2,n,dp);
   
           
           int notpick=cost(nums,i+1,n,dp);
           dp[i]=Math.max(pick,notpick);
           return dp[i];
    }
    public int rob(int[] nums) {
    
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
       int r= Math.max(cost(nums,0,n-2,dp1),cost(nums,1,n-1,dp2));
return r;

    }
}
