package java_codes.Searching_algorithm;

// linear search in a 2-D array

import java.util.Arrays;

public class Linear_Search6 {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2, 3},
                {4 , 5, 6},
                {7 , 8 ,9}
        };
        int target = 4;
        System.out.println(Arrays.toString( search( arr , target) ) );
    }

    public static int[] search(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {           // m rows
            for (int j = 0; j < matrix[0].length; j++) {    // n columns
                if (matrix[i][j] == target) {
                    return new int[] {i , j};  // found
                }
            }
        }
        return new int[] {-1 , -1};  // not found
    }
}
