package Practice_2;

public class SeriesMergedFind {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int n = 9;
        if (n % 2 == 0) {
            System.out.println(b[n / 2 - 1]);
        } else {
            if (a.length / 2 < n)
                System.out.println(a[n / 2]);
        }
    }

}
