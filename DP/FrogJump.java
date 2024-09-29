package DP;
import java.util.Arrays;
public class FrogJump {
    public static int Jump(int ind, int[] height,int[] dp){

        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int right= Integer.MAX_VALUE;
        int left=Jump(ind-1, height, dp)+Math.abs(height[ind]- height[ind-1]);
        if(ind>1){
            right=Jump(ind-2, height,dp)+Math.abs(height[ind]- height[ind-2]);
        }

        return dp[ind]=Math.min(left, right);


    }
    public static int frogJump(int n, int heights[]) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return Jump(n-1, heights, dp);


    }

    public static void main(String[] args) {
        int n=6;
        int [] heights= {30,10,60,10,60,50};

        System.out.println(frogJump(n, heights));
    }
}
