package Practice_2;

import java.util.HashMap;
import java.util.Scanner;

public class Remove_Dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {

            hm.put(sc.nextInt(), 0);
        }

        hm.forEach((key, value) ->
                System.out.print(key+" ")
        );


    }
}
