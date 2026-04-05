package Practice_3;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Hi my name is phanendra";
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                ind = i;
            }
        }
        System.out.println(arr[ind]);
        ;

    }

    public static int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }

    private static int backtrack(String s, int index, HashSet<String> set) {

        // Base case
        if (index == s.length()) {
            return set.size();
        }

        int max = 0;

        for (int i = index + 1; i <= s.length(); i++) {
            String sub = s.substring(index, i);

            if (!set.contains(sub)) {
                set.add(sub);

                max = Math.max(max, backtrack(s, i, set));

                set.remove(sub); // backtrack
            }
        }

        return max;
    }


}
