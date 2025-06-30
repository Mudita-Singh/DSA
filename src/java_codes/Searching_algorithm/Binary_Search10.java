package java_codes.Searching_algorithm;

// binary search in a 2-D array
// only rows are sorted
// no global sorting

import java.util.Arrays;

public class Binary_Search10 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1 , 3, 5},
                {2 , 4 ,6},
                {0 , 7 , 8}
        };
        int target = 4;
        System.out.println(searchMatrix( matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] < target) start++;
                else end--;
            }
        }
        return false;
    }}


