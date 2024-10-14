package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static int Partition (List<Integer> arr, int left, int right){
        int pivot= arr.get(right);
        int i=left-1;
        for(int j=left; j<right; j++){
            if(arr.get(j)<=pivot){
                i++;
                Collections.swap(arr,i,j);
            }
        }
//        Swap Pivot
        i++;
        Collections.swap(arr,i,right);
        return i;
    }
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(6,3,9,5,2,8));


        Partition(list,0,list.size()-1);
    }
}
