package java_codes.Recursion;

public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(find(5));
    }

    public static int find(int n){
        if(n <= 1){
            return n ;
        }
        return n * find(n-1);
    }
}
