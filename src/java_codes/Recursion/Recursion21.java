package java_codes.Recursion;

// given a string remove all a's from it
// using recursion

public class Recursion21 {
    public static void main(String[] args) {

        System.out.println( skip("baccad") );


    }

    public static String skip( String old ){
        if(old.isEmpty()){
            return ""; // return back an empty string
        }

        char ch = old.charAt(0);

        if( ch == 'a'){
            return skip(old.substring(1)); // skip ch if ch = 'a'

        }else{

            return ch + skip(old.substring(1)); // add ch to the string

        }
    }
}
