package java_codes.Recursion;

// print all subsets
// using iterative approach

import java.util.ArrayList;
import java.util.List;

public class Recursion27 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);

        // print all subsets
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // start with empty subset

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}

/* Explanation

First outer loop → num = 1
n = outer.size() = 1  -> [ [] ]

Inner loop:
i = 0:
Copy outer.get(0) → []
Add 1 → [1]
Add to outer

 */
