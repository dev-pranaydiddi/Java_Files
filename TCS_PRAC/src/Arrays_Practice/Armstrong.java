package Arrays_Practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nm = num;
        int len = String.valueOf(num).length();
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += (int) Math.pow(rem, len);
            num /= 10;
        }
        System.out.println(sum == nm);
    }
}
