package java_codes.sorting_algorithm;

import java.util.Arrays ;

// merge sort

public class Sorting_Merge {
    public static void main(String[] args) {
        int[] arr = { 5 , 4, 3, 2 ,1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort( int[] arr){
        if( arr.length == 1){
            return arr;
        }

        int mid = arr.length/2 ;

        int[] left = sort( Arrays.copyOfRange( arr , 0 , mid));
        int[] right = sort( Arrays.copyOfRange( arr , mid , arr.length));

        return merge(left , right);
    }

    public static int[] merge( int[] arr1 , int[] arr2){

        int[] mix = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < arr1.length && j < arr2.length){
            if( arr1[i] < arr2[j]){
                mix[k] = arr1[i];
                i++;
            }
            else{
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }

        // it may be possible that elements are still left in one of the arrays
        while( i < arr1.length){
            mix[k] = arr1[i];
            i++;
            k++;
        }

        while( j < arr1.length){
            mix[k] = arr1[j];
            j++;
            k++;
        }

        return mix;

    }
}
