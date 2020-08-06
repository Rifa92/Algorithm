package Algorithm;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        //this is unsorted array
        Integer [] array = new Integer[]{12,13,24,10,3,5,6,9,1};
        //Lets sort using quic sort

        quickSort (array, 0 , array.length-1);
            //verify sorted array
        System.out.println(Arrays.toString(array));

    }
    public  static  void quickSort (Integer[] arr,int low,int high){
        // check for empty or null array
        if(arr == null || arr.length==0){
            return;
        }
        if (low>=high){
            return;
        }
        int middle = low +(high - low)/2;
        int pivot = arr[middle];
        int i = low , j = high;
        while (i<=j){
            while (arr[i] <pivot){
                ++i;

            }
            while (arr[j]> pivot){
                --j;
            }
            if (i<=j){
                swap (arr, i,j);
                i++;
                j--;
            }
        }
        if (low <j){
            quickSort(arr,low , j);

        }
        if (high > i){
            quickSort(arr, i, high);

        }
    }
    public static void swap (Integer array [] , int x , int y){
        int temp = array [x];
        array [x ]=array[y];
        array [y] = temp;
    }
}
