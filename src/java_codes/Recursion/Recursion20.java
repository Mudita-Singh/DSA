package java_codes.Recursion;

// given a string remove all a's from it
// using recursion

public class Recursion20 {
    public static void main(String[] args) {

        skip("" , "baccad");


    }

    public static void skip( String n , String old ){
        if(old.isEmpty()){
            System.out.println(n);
            return ; // return back
        }

        char ch = old.charAt(0);

        if( ch == 'a'){
            skip(n , old.substring(1));

        }else{

            skip( n + ch , old.substring(1));

        }
    }
}
