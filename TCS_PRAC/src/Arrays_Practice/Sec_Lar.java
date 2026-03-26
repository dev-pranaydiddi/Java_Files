package Arrays_Practice;

import java.util.Scanner;

public class Sec_Lar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n <= 0) {
            System.out.println("Error : Invalid Size");
        }
        int l = arr[0], sl = Integer.MIN_VALUE;
        // MAIN CODE
        // MAIN CODE
        for (int i = 0; i < n; i++) {
            if (arr[i] > l && arr[i] != l) {
                sl = l;
                l = arr[i];
            } else{
                sl = arr[i];
            }
        }
        System.out.println("Second Largest = " + sl);
    }
}

