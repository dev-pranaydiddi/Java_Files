package Practice_2;

public class RotateArrayLR {
    public static int[] rotateRight(int[] arr, int k) {
        if (arr == null || arr.length == 0) return arr;

        int n = arr.length;
        k = k % n;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = arr[i];
        }

        return res;
    }

    public static int[] rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length == 0) return arr;

        int n = arr.length;
        k = k % n;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int[] result1 = rotateLeft(arr, k);
        int[] result2 = rotateRight(arr, k);

        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
