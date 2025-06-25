class Solution {
    public int cost(int i,int[] price,int n,int[][] dp){
        
        if(i==0){
            return n*price[0];
        }
        if(dp[i][n]!=-1){
            return dp[i][n];
        }
        int not_pick=0+cost(i-1,price,n,dp);
        int pick=Integer.MIN_VALUE;
        int rod_length=i+1;   
        if(rod_length<=n){
            pick=price[i]+cost(i,price,n-rod_length,dp);
        }
        dp[i][n]=Math.max(not_pick,pick);
        return dp[i][n];
    }
    public int cutRod(int[] price) {
        int n=price.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
      return  cost(n-1,price,n,dp);
        
    }
}
