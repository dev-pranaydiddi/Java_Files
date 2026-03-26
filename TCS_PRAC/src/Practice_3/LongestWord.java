package Practice_3;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Hi my name is phanendra";
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;int  ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()> max)
            {
                max = arr[i].length();
                ind = i;
            }
        }
        System.out.println(arr[ind]);;

        }
}
