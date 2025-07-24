package java_codes.Recursion;

import java.util.ArrayList;

// linear search using recursion
// with duplicate elements
// by storing the indices of target in a list ( passed in parameter )

public class Recursion13 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 4 , 4 , 5};
        int target = 4;

        ArrayList<Integer> ans = find( arr , target , 0 , new ArrayList<>());

        System.out.println(ans); // print the list

    }

    public static ArrayList<Integer> find( int[] arr , int target , int idx , ArrayList<Integer> list){

        if( idx == arr.length -1 ){
            return list;
        }
        if( arr[idx] == target){
            list.add(idx);
        }

        return find( arr , target , ++idx , list);
    }
}
