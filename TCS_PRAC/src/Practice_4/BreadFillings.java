package Practice_4;

import java.io.OptionalDataException;
import java.util.Scanner;

public class BreadFillings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        sc.nextLine();
        String[] str1 = sc.nextLine().split(" ");
        String[] str2 = sc.nextLine().split(" ");
        int[] a = new int[str1.length];
        int[] b = new int[str2.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(str2[i]);
        }
        int max = 0, k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) {
                max = a[i];
                break;
            }
            k = max(a[i], b, tar, 0);
            if (max <= k && k <= tar) max = k;
        }
        System.out.println(max);
    }

    private static int max(int base, int[] b, int tar, int i) {
        if (base == tar) return base;
        if (i < b.length) {
            int x = max(base, b, tar, i + 1);
            int y = max(base + b[i], b, tar, i + 1);
            int z = max(base + 2 * b[i], b, tar, i + 1);
            if (x >= base && x <= tar) base = x;
            if (y >= base && y <= tar) base = y;
            if (z >= base && z <= tar) base = z;
        }
        return base;
    }
}
