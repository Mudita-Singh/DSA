package java_codes.Bitwise_operators;

// find factors of a number
// more optimized way

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        find( 20);
    }

    public static void find(int n){

//        for( int i = 1 ; i <= Math.sqrt(n) ; i++){
//            if( n%i == 0){
//                if(n/i == i){
//                    System.out.print(i + " ");  // duplicate value like for n = 36 , i = n/i = 6
//                }
//                else{
//                    System.out.print(i + " " + n/i + " ");
//                }
//            }
//        }
//    }      // this doesn't print the factors in sorted order


        // to print the factors in sorted order

        ArrayList<Integer> list = new ArrayList<>();

        for( int i = 1 ; i <= Math.sqrt(n) ; i++){
            if( n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");  // duplicate value like for n = 36 , i = n/i = 6
                }
                else{
                    System.out.print(i + " " );
                    list.add(n/i);
                }
           }
        }

        // print list
        for( int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}


