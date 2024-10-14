package TwoPointer;

public class MaxConsecutiveOnesIII {
    public static int BruteApproach(int[] nums, int k){
        int n=nums.length;

        int maxLen=0;
        for(int i=0;i<n; i++){
            int countZero=0;
            for(int j=i; j<n; j++){
                if(nums[j]==0) countZero++;
                if(countZero<=k){
                    maxLen= Math.max(maxLen, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }

    public static int longestOnes(int[] nums, int k) {
        int maxLen=0, left=0, right=0, zeros=0, n=nums.length;

        while(right<n){
            if(nums[right]==0) zeros++;
            if(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
            if(zeros<=k){
                maxLen= Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr={1,1,0,0,0,1,1,1,1,0};
        int k=2;
//        System.out.println(BruteApproach(arr, k));
        System.out.println(longestOnes(arr, k));

    }
}
