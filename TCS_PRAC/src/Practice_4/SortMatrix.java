package Practice_4;


import java.util.Scanner;
import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] dim = sc.nextLine().split(" ");
        int row = Integer.parseInt(dim[0]);
        int col = Integer.parseInt(dim[1]);
        int[] arr = new int[row*col];
        int m=0;
        for (int  i= 0;  i< row; i++) {
            String[] values = sc.nextLine().split(" ");
            for (int j = 0; j < values.length; j++) {
                arr[m++] =  Integer.parseInt(values[j]);
            }
        }

        Arrays.sort(arr);
        m=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[m++]);
                if(j<col-1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
