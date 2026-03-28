package Practice_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BreadNFillings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(",");
        int[] a = new int[str1.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }

        str1 = sc.nextLine().split(",");
        int[] b = new int[str1.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(str1[i]);
        }
        int tar = sc.nextInt();
        int max =0;
        for (int i = 0; i < a.length; i++) {
            int base = a[i];
            int key = max(base, tar, b, 0);
            if(key>=max && key<=tar){
                max = key;
            }
        }
        System.out.println(max);

    }

    private static int max(int base, int tar, int[] b, int i) {
        for (int j = i; j < b.length; j++) {
            if (base == tar) return base;
            if (i < b.length) {
                int x = max(base, tar, b, i + 1);
                int y = max(base + b[i], tar, b, i + 1);
                int z = max(base + 2 * b[i], tar, b, i + 1);
                if (x >= base && x <= tar) base = x;
                if (y >= base && y <= tar) base = y;
                if (z >= base && z <= tar) base = z;
            }
        }
        return base;
    }
}