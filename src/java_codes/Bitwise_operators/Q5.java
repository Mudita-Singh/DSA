package java_codes.Bitwise_operators;

// find the sum of nth row of a pascal's triangle

public class Q5 {
    public static void main(String[] args) {
        search(4);
    }

    public static void search( int num ){
        System.out.println( 1 << num );  // 1 << num = 1 * 2^n  // sum of nth row of pascal's triangle is 2^n
    }

}
