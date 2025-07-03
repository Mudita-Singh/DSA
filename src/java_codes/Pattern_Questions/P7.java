package java_codes.Pattern_Questions;

public class P7 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            if(i <= n ) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                for (int k = 2; k <= i; k++) {
                    System.out.print(k);

                }
                System.out.println();
            }
            else{
                for( int j =1 ; j<= i-n ; j++){
                    System.out.print(" ");
                }
                for(int j = 2*n-i ; j>=1 ; j--){
                    System.out.print(j);
                }

                for(int k=2 ; k <= 2*n-i ; k++){
                    System.out.print(k);
                }

                System.out.println();
            }
        }
    }
}
