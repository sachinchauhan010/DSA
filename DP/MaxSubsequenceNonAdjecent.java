package DP;
import java.util.ArrayList;
import java.util.Arrays;
public class MaxSubsequenceNonAdjecent {

    public static int maxSum(int i, ArrayList<Integer> arr, int [] dp){
        if(i==0) return arr.get(i);
        if(i<0) return 0;

        int pick=arr.get(i)+ maxSum(i-2, arr, dp);
        int notPick=maxSum(i-1, arr, dp);

        return dp[i]= Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 9));
        int n= list.size();
        int[] dp= new int[n];
        Arrays.fill(dp, -1);

        System.out.println(maxSum(n-1,list, dp));
    }
}
