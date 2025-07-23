package java_codes.Bitwise_operators;

// find GCD using euclid's algo
// using recursive calls

public class Q13 {
    public static void main(String[] args) {
        System.out.println(find(4 , 8));
    }

    public static int find( int a , int b){
        if( a == 0 ){
            return b;
        }
        return find( b%a , a);
    }
}
