package java_codes.Bitwise_operators;

// find lcm of 2 numbers
// using recursive call

public class Q14 {
    public static void main(String[] args) {

        System.out.println(find2(12,6));
    }

    // hcf
    public static int find1( int a , int b){
        if(a==0){
            return b;
        }

        return find1( b%a , a);
    }

    // lcm
    public static int find2(int a , int b){
        return a*b/find1(a,b);
    }
}
