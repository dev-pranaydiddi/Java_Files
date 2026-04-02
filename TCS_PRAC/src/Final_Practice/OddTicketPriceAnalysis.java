package Final_Practice;

import java.util.*;
import java.lang.*;

public class OddTicketPriceAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        float amount = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                amount += arr[i];
                n++;
            }
        }
        if (n == 0) System.out.println("0 0 0.00");
        else {
            float average = amount / n;
            System.out.printf("%d %d %.2f",(int)amount,n,average);
        }
    }
}
