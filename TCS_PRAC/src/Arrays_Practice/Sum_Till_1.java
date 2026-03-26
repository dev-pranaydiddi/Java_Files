package Arrays_Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sum_Till_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int nm = num;
        int rem = 0;

        // alternative method
        System.out.println((num - 1) % 9 + 1);


        while (num > 9) {
            while (num > 0) {
                rem = num % 10;
                sum += rem;
                num /= 10;
            }
            num = sum;
            sum = 0;
        }
        System.out.println(num);
    }
}

