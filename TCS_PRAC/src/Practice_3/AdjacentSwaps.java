package Practice_3;
//arr1 = [10,20,30,40,50]
//arr2 = [30,40,10,20,50]

//public class AdjacentSwaps {
//    public static void main(String[] args) {
//        int[] arr1 = {3,6,4,8};
//        int[] arr2 = {4, 6, 8, 3};
//        int count = 0;
//        System.out.println(adjswap(arr1, arr2));
//    }
//
//    public static int adjswap(int[] a, int[] b) {
//        int count = 0;
//        if (a.length == b.length) {
//            for (int i = 0; i < a.length; i++) {
//                int tar = a[i];
//                int j = i;
//                if (a[i] != b[j]) {
//                    if (j + 1 > b.length) {
//                        return count;
//                    } else {
//                        int find = search(b, tar, j + 1, b.length);
//                        swap(b, find, j);
//                        count += find - j;
//                    }
//                } else {
//                   continue;
//                }
//            }
//            return count;
//        }
//        return -1;
//    }
//
//    private static void swap(int[] b, int find, int j) {
//        for (int x = find; x > j; x--) {
//            int temp = b[x - 1];
//            b[x - 1] = b[x];
//            b[x] = temp;
//        }
//    }
//
//    private static int search(int[] b, int tar, int i, int length) {
//        while (i < length && b[i] != tar)
//            i++;
//        return i;
//    }
//}


import java.util.Arrays;

public class AdjacentSwaps {

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 4, 8};
        int[] arr2 = {4, 6, 8, 3};

        int result = minAdjacentSwaps(arr1, arr2);

        if (result == -1) {
            System.out.println("Invalid input: arrays are not permutations");
        } else {
            System.out.println("Minimum adjacent swaps: " + result);
        }
    }

    public static int minAdjacentSwaps(int[] target, int[] current) {
        if (target.length != current.length) return -1;

        int n = target.length;
        int swaps = 0;

        // Optional: check if both arrays have same elements
        if (!isValidPermutation(target, current)) return -1;

        for (int i = 0; i < n; i++) {

            // If already correct, skip
            if (current[i] == target[i]) continue;

            // Find target[i] in current array
            int j = i + 1;
            while (j < n && current[j] != target[i]) {
                j++;
            }

            // If not found → invalid case
            if (j == n) return -1;

            // Bring element to position i using adjacent swaps
            while (j > i) {
                swap(current, j, j - 1);
                j--;
                swaps++;
            }
        }

        return swaps;
    }

    // Swap adjacent elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Check if both arrays contain same elements
    private static boolean isValidPermutation(int[] a, int[] b) {
        int[] aCopy = Arrays.copyOf(a, a.length);
        int[] bCopy = Arrays.copyOf(b, b.length);

        Arrays.sort(aCopy);
        Arrays.sort(bCopy);

        return Arrays.equals(aCopy, bCopy);
    }
}