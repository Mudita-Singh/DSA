package java_codes.sorting_algorithm;

import java.util.Arrays;

// selection sort

public class Sorting_Selection1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort( int[] arr){
        for( int i = 0 ; i < arr.length ; i++){
            int end = arr.length - i - 1;
            int max = max( arr , end);
            swap( arr , end , max );
        }

    }

    public static int max( int[] arr , int end ){
        int max = 0;
        for ( int j = 0 ; j <= end ; j++){
            if( arr[j] > arr[max]){
                max = j;
            }
        }
        return max ;
    }

    public static void swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
