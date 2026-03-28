package Practice_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputReading {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int[] arr1 = new int[list.size()];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = list.get(i);
            System.out.println(list.get(i));

        }
        System.out.println(Arrays.toString(arr1));

    }
}
