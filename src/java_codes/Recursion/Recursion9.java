package java_codes.Recursion;

// count the number of 0's in a number
// using recursion

public class Recursion9 {
    public static void main(String[] args) {

        int count = 0;
        System.out.println(count(102003 , count));

    }

    public static int count( int n , int count){
        if(n==0){
            return count ;
        }
        int num = n%10 ;

        if( num == 0){
            return count(n/10 , count+1);
        }
        else{
            return count(n/10 , count);
        }

    }
}
