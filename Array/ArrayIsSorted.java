package Array;

public class ArrayIsSorted {
    public boolean CheckSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
           if(arr[i]>arr[i-1]) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};

        ArrayIsSorted obj = new ArrayIsSorted();
        System.out.println(obj.CheckSorted(arr));
    }
}
