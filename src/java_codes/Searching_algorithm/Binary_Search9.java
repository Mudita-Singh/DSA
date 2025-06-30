package java_codes.Searching_algorithm;

// binary search in a 2-D array
// Leetcode 240
//rows and columns are sorted
// no global sorting

import java.util.Arrays;

public class Binary_Search9 {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 4 , 7},
                {2 , 5, 8},
                {3 , 6 , 9}
        };
        int target = 4;
        System.out.println(Arrays.toString( search( arr , target) ) );
    }

    public static int[] search( int[][] arr , int target){
        int row = 0;
        int column = arr[0].length-1; // column index

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
