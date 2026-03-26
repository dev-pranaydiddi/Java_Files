package Practice_3;

import java.util.Arrays;
import java.util.Scanner;

public class BalloonWeight {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <n; i++){
            if (max > arr[i]){
                max -= arr[i];
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(count);
    }
}
