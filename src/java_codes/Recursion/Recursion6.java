package java_codes.Recursion;

// reverse a number
// method - 1   // using an extra variable

public class Recursion6 {
    public static void main(String[] args) {
        find(1234);
        System.out.println(sum);
    }

    static int sum = 0;    //  we can also make the variable inside main and pass it in method call

    public static void find(int n){
        if(n == 0){
            return ;    // no digit left
        }

        sum = sum + n%10 ;

        find(n/10);
    }
}
