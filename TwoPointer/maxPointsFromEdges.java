package TwoPointer;

public class maxPointsFromEdges {

    public static int maxSum(int[] arr, int k){
//        Find left sum
        int  lSum=0, maxSumVal=0;
        int rightIndex=arr.length-1, rSum=0;

        for(int i=0; i<k; i++){
            lSum+=arr[i];
        }

        for(int i=k-1; i>=0; i--){
            lSum-=arr[i];
            rSum+=arr[rightIndex];
            rightIndex--;

            maxSumVal=Math.max(maxSumVal, lSum+ rSum);

        }
        return maxSumVal;

    }
    public static void main(String[] args) {
        int [] arr={2,5,1,10,10};
        System.out.println(maxSum(arr,3));
    }
}
