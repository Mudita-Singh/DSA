package java_codes.Recursion;

// bubble sort
// using recursion

import java.util.Arrays;

public class Recursion18 {
    public static void main(String[] args) {

        int[] arr = {4 , 2 , 3, 1 };
        System.out.println(Arrays.toString(sort(arr , arr.length -1  , 0)));

    }

    public static int[] sort(int[] arr , int i , int j){

        if( i == 0){
            return arr;
        }

        if( j < i ) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

            return sort(arr , i , j+1);
        }

        return sort( arr , i - 1 , 0);

    }
}
