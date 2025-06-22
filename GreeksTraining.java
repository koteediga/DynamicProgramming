// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
          int m=arr.length;
          int n=arr[0].length;
          int sum=0;
          int[][] dp=new int[m][n];
          for(int i=0;i<n;i++){
             dp[0][i]=arr[0][i];
          }
          
          for(int i=1;i<m;i++){
             // int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                int prev=Integer.MIN_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        prev=Math.max(prev,dp[i-1][k]);
                    }
                }
           dp[i][j]=arr[i][j]+prev;
            }
          
          }
          int min=Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
              min=Math.max(min,dp[m-1][i]);
          }
        return min;
    }
}
