package Practice_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// integer
// gen
public class AnagramStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        System.out.println(check(str1, str2));
        // using char array sort and equals
//        char[] str1ch = str1.toCharArray();
//        char[] str2ch = str2.toCharArray();
//        Arrays.sort(str1ch);
//        Arrays.sort(str2ch);
//        System.out.println(Arrays.equals(str1ch, str2ch));

        // jumpinthecarundertree

        // using HashMap

    }

    public static boolean check(String str1, String str2) {
        Map<Character, Integer> hm = new HashMap<>();

        // filling hashmap
        for (char ch : str2.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        //
        for (char ch : str1.toCharArray()) {
            if (hm.getOrDefault(ch, 0) > 0) {
                hm.put(ch, hm.get(ch) - 1);
            }
        }

        //
        for (char ch : str2.toCharArray()) {
            if (hm.getOrDefault(ch, 0) != 0) {
                return false;
            }
        }

        return true;
    }
}
