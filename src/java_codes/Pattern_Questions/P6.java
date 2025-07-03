package java_codes.Pattern_Questions;

public class P6 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
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
    }
}