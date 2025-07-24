package java_codes.Recursion;

// print pattern using recursion

// ****
// ***
// **
// *

public class Recursion16 {
    public static void main(String[] args) {

        find( 4 , 0 );
    }

    public static void find( int row , int col){
        if( row == 0){
            return ;
        }

        if( col < row){
            System.out.print("* ");
            find(row , col+1);
        }
        else{
            System.out.println( );
            find( row-1 , 0);

        }
    }
}
