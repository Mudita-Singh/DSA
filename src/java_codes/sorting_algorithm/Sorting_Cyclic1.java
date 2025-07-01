package java_codes.sorting_algorithm;

import java.util.Arrays;

// cyclic sort

public class Sorting_Cyclic1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort( int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    }

    public static void swap ( int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
