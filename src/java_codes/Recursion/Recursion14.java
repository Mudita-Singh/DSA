package java_codes.Recursion;


// linear search using recursion
// with duplicate elements
// by storing the indices of target in a list ( new list is made everytime in find method )

import java.util.ArrayList;

public class Recursion14 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 4 , 4 , 5};
        int target = 4;

        ArrayList<Integer> ans = find( arr , target , 0 );

        System.out.println(ans); // print the list

    }

    public static ArrayList<Integer> find( int[] arr , int target , int idx ){

        // new list will be made in each recursive call
        ArrayList<Integer> list = new ArrayList<>();

        if( idx == arr.length -1 ){
            return list;
        }
        if( arr[idx] == target){
            list.add(idx);
        }

        ArrayList<Integer> ansFromBelow = find( arr , target , ++idx );

        list.addAll( ansFromBelow );  // combine list and ansFromBelow ArrayLists

        return list;
    }
}
