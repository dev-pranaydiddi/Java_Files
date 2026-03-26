package Arrays_Practice;

import java.util.ArrayList;
import java.util.Arrays;

//public class Rev_Each_Str {
//
//    public static void main(String[] args) {
//        String input = "Hello World TCS";
//        String[] words = input.split(" ");
//
//        String result = "";
//
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String reversedWord = "";
//
//            // reverse each word using loop
//            for (int j = word.length() - 1; j >= 0; j--) {
//                reversedWord = reversedWord + word.charAt(j);
//            }
//
//            result = result + reversedWord + " ";
//        }
//
//        System.out.println(input);
//        System.out.println(result.trim());
//    }
//}
//
//
public class Rev_Each_Str {

    public static void main(String[] args) {
        String input = "Hello World TCS";
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }
            result.append(" ");
        }
        System.out.println(result.deleteCharAt(input.length()));
    }
}
