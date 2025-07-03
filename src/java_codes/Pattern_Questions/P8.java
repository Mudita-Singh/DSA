package java_codes.Pattern_Questions;

public class P8 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for( int i = 0 ; i<=2*n ; i++){
            for( int j=0 ; j<= 2*n ; j++){
               int a = Math.min( Math.min(i, j) , Math.min( 2*n-i , 2*n-j));
                System.out.print(a);
            }
            System.out.println();
        }
    }

}
