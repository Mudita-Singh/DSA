package java_codes.Recursion;

import java.util.*;

// print all subsets
// using iterative approach
// array having duplicate values

public class Recursion28{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr); // Step 1: sort to group duplicates
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // Step 2: if current element is same as previous,
            // start from where previous additions began
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
