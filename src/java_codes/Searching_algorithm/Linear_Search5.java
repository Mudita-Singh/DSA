package java_codes.Searching_algorithm;

import java.util.Arrays;

public class Linear_Search5 {
    public static void main(String[] args) {
        int[][] arr = { {1 , 2} ,{3, 4, 5}};
        int target = 3 ;
        System.out.println(Arrays.toString(search(arr , target)));


    }
    static int[] search ( int[][] arr , int target  ){
        for( int i = 0 ; i< arr.length ; i++){
            for( int j = 0 ; j< arr[i].length ; j++){
                if(arr[i][j] == target ){
                    return new int[] {i , j};
                }
            }
        }
        return new int[] { -1 , -1};
    }

}



