package Array;

public class LargestElement {
    public int getLargestElement(int[] arr){
        if(arr.length==1) return arr[0];

        int large=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>large) large=arr[i];
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr= {8,10,5,7,9};

        LargestElement obj = new LargestElement();
        System.out.println(obj.getLargestElement(arr));
    }
}
