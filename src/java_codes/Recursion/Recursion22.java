package java_codes.Recursion;

// given a string , skip a substring "apple"
// using recursion

public class Recursion22 {
    public static void main(String[] args) {

        System.out.println( skip("bappleccad") ); // remove substring "apple" from it


    }

    public static String skip( String old ){
        if(old.isEmpty()){
            return ""; // return back an empty string
        }


        if( old.startsWith("apple")){
            return skip(old.substring(5)); // skip apple

        }else{

            return old.charAt(0) + skip(old.substring(1));
        }
    }
}

