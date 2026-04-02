package Practice_4;

import java.util.Scanner;

public class MaxSubArrProd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(maxProSubArr(arr));
        System.out.println(maxProArr(arr));


    }

    private static int maxProArr(int[] arr) {
        int negCount = 0;
        int zeroCount = 0;
        int prod = 1;
        int maxNeg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                continue;
            } else if (arr[i] < 0) {
                negCount++;
                maxNeg = Math.max(maxNeg, arr[i]);
            }
            prod *= arr[i];
        }
        if (zeroCount == arr.length) return 0;
        if (negCount % 2 == 1) {
            if(negCount == 1 && zeroCount+negCount == arr.length) return 0;
            return prod / maxNeg;
        }
        return prod;
    }

    public static int maxProSubArr(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int subMax = Math.max(arr[i], Math.max(max * arr[i], min * arr[i]));
            int subMin = Math.min(arr[i], Math.min(max * arr[i], min * arr[i]));
            max = subMax;
            min = subMin;
            result = Math.max(result, max);
        }
        return result;
    }
}
