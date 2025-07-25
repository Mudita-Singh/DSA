package java_codes.Recursion;

import java.util.Arrays;

public class Recursion19 {
    public static void main(String[] args) {

        int[] arr = { 3 , 4 , 2 , 1};
        int[] ans = find( arr , arr.length - 1 , 0);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] find( int[] arr , int end , int max){

        if(end == 0){
            return arr;
        }

        max = findMax( arr , end , 0 , 0);
        swap( arr ,end , max);

        return find(arr , end-1 , max);

    }



    // return the max element
    public static int findMax( int[] arr , int end , int idx , int max){

        if(idx > end){
            return max;
        }

        if(arr[idx ] > arr[max] ){
            max = idx ;
        }

        return findMax( arr , end , idx+1 , max);

    }

    // swap the numbers
    public static void swap( int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
