package java_codes.Pattern_Questions;

// Diamond shape

public class P5 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for( int i = 1; i <= 2*n-1 ; i++){
            if( i <= n) {
                for( int k=1 ; k<= n-i ; k++){
                    System.out.print(" ");
                }

                for( int j =1 ; j<= i ; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            else{
                for( int k=1 ; k<= i-n ; k++){
                    System.out.print(" ");
                }

                for( int j =1 ; j<= 2*n-i ; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
}
