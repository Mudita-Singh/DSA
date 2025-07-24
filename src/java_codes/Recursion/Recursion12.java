package java_codes.Recursion;

import java.util.ArrayList;

// linear search using recursion
// with duplicate elements
// by storing the indices of target in a list ( static )

public class Recursion12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4 , 4 , 6};
        int target = 4;

        find( arr , target , 0);
        System.out.println( list );
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void find( int[] arr , int target , int idx){
        if( idx == arr.length - 1 ){
            return ;
        }
        if( arr[idx] == target){
            list.add(idx);
        }
            find(arr , target , ++idx); // don't put this in else otherwise only first target will get added in the list

    }
}
