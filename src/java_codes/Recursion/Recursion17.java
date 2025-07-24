package java_codes.Recursion;

// print pattern using recursion
// *
// **
// ***
// ****

public class Recursion17 {
    public static void main(String[] args) {

        find(4, 0); // 4 row left to be printed // 0 column/star printed
    }

    public static void find( int row , int col){
        if( row == 0){
            return ;
        }
        if( col < row ){
            find(row , col+1);
            System.out.print("* ");
        }
        else{
            find(row-1 , 0);
            System.out.println( );
        }
    }
}
