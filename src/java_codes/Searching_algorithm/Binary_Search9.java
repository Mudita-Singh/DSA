package java_codes.Searching_algorithm;

// binary search in a 2-D array

import java.util.Arrays;

public class Binary_Search9 {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2, 3},
                {4 , 5, 6},
                {7 , 8 ,9}
        };
        int target = 4;
        System.out.println(Arrays.toString( search( arr , target) ) );
    }

    public static int[] search( int[][] arr , int target){
        int row = 0;
        int column = arr.length-1;

        while ( row < arr.length && column >= 0 ){
            if(target == arr[row][column]){
                return new int[] { row , column};
            }
            if(target > arr[row][column]){
                row++;
            }
            else{
                column--;
            }

        }
        return new int[] {-1 , -1}; // not found
    }

}
