package Array;

public class SecondSmallestLargest {

    public int[] betterApproach(int[] arr){
        if(arr.length<=1) return new int[]{-1,-1};
        int large=Integer.MIN_VALUE, sec_large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE, sec_small=Integer.MAX_VALUE;

//        Find the largest and smallest element
        for(int i=0; i<arr.length; i++){
            large=Math.max(large, arr[i]);
            small=Math.min(small, arr[i]);
        }

//        Now find second Largest and smallest
        for(int i=0;i<arr.length; i++){
            if(arr[i]<sec_small && arr[i]!=small) sec_small=arr[i];
            if(arr[i]>sec_large && arr[i]!=large) sec_large=arr[i];
        }
        return new int[]{sec_small, sec_large};
    }
    public static void main(String[] args) {
        int[] arr= {8,10,5,7,9};

        SecondSmallestLargest obj = new SecondSmallestLargest();
        int[] res= obj.betterApproach(arr);
        System.out.println(res[0]+" "+ res[1]);
    }
}
