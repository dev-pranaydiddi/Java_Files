package Practice_2;

import java.util.Scanner;

public class MaxSubSetSum {
    static int maxSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        int[] resultArr = new int[test];

        for (int i = 0; i < test; i++) {
            int len = sc.nextInt();
            int[] arr = new int[len];

            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
            }

            int target = sc.nextInt();

            maxSum = 0;
            findMaxSubsetSum(arr, target, 0, 0);

            resultArr[i] = maxSum;
        }

        for (int val : resultArr) {
            System.out.println(val);
        }
    }

    private static void findMaxSubsetSum(int[] arr, int target, int index, int currentSum) {

        // if exceeds target → stop
        if (currentSum > target) return;

        // update max
        maxSum = Math.max(maxSum, currentSum);

        for (int i = index; i < arr.length; i++) {
            findMaxSubsetSum(arr, target, i + 1, currentSum + arr[i]);
        }

    }
}