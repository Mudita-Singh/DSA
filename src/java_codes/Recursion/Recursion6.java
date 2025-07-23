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

// return type of find is void because the variable which is getting changed (sum) is outside method find
// sum variable is also in the scope of main method  , main can also access it