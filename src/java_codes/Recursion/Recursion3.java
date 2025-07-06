package java_codes.Recursion;

// fibonacci series using formula

public class Recursion3 {
    public static void main(String[] args) {
        System.out.println( search(6) );
    }

    public static int search( int n){
        return(int)( (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5) );
    }
}
