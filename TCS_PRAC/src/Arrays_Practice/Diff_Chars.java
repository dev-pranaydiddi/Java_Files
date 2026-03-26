package Arrays_Practice;

import java.util.Scanner;

public class Diff_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(str);
        int vow = 0, cons = 0, spec = 0, space = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') space++;
            else if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            } else
                spec++;
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
        System.out.println("Spaces: " + space);
        System.out.println("Special: " + spec);

    }
}
