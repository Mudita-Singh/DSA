package java_codes.Basic_codes;

import java.util.HashMap;
import java.util.Map;

// frequency count

public class Q11
{
    public static void main(String[] args) {

        String s = "hello";

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0)+ 1);
        }

        for(Map.Entry<Character , Integer> set : map.entrySet()){
            System.out.print(set.getKey() + " " + set.getValue() + " ");
        }

    }

}
