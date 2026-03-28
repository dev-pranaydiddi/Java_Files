package Practice_3;

public class MaxArrayProd {

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProduct = 1;
        int countNeg = 0;
        int maxNeg = Integer.MIN_VALUE; // closest to zero negative
        int countZero = 0;

        for (int j : arr) {
            if (j == 0) {
                countZero++;
                continue;
            }

            if (j < 0) {
                countNeg++;
                maxNeg = Math.max(maxNeg, j);
            }

            maxProduct *= j;
        }

        // Edge case: all zeros
        if (countZero == n) return 0;

        // If odd number of negatives → remove one
        if (countNeg % 2 == 1) {

            // Special case: only one negative and rest zeros
            if (countNeg == 1 && countZero + countNeg == n) {
                return 0;
            }
            maxProduct /= maxNeg;
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, -1, 0, 3};
        System.out.println(maxProduct(arr)); // Output: 6
    }
}
