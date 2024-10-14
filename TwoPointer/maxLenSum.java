package TwoPointer;

public class maxLenSum {
    public static int maxLengthSubstring(int[] arr, int val){
        int n=arr.length;
        int l=0, r=0, sum=0, maxLen=0;

        while(r<n){
            sum+=arr[r];
            if(sum<=val){
                maxLen=Math.max(maxLen, r-l+1);
                r++;
            }else{

                l++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr={2,5,1,10,10};
        System.out.println(maxLengthSubstring(arr, 14));
    }
}
