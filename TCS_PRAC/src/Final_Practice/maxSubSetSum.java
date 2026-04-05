package Final_Practice;


public class maxSubSetSum {
    static int max;

    public static void main(String[] args) {

    }

    public static void check(int[] arr, int currSum, int tar, int index) {
        if (currSum > tar) return;
        max = Math.max(max, currSum);
        for (int i = index; i <arr.length; i++) {
            check(arr, currSum + arr[i], tar, i+1);
        }

    }
}


