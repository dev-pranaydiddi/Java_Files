package Final_Practice;

import java.util.*;
import java.lang.*;


public class SortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[row * col];
        int ind = 0;
        for (int i = 0; i < row; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                arr[ind] = Integer.parseInt(str[j]);
                ind++;
            }
        }
        int count = 0;
        Arrays.sort(arr);
                System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[count]);
                count++;
                if (j != col - 1) System.out.print(" ");
            }
            if(i<row-1)
                System.out.println();
        }
    }
}
