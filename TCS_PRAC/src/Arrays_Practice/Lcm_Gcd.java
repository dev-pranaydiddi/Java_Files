package Arrays_Practice;

import java.util.Scanner;

public class Lcm_Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = (a*b)/gcd;
        System.out.println(lcm +" "+gcd);
    }

    public static int findGCD(int a, int b) {

        // recursive euclidean algo
//        if (b == 0) return a;
//        return findGCD(b, a % b);

        // traditional euclidean algo
        int temp=0;
        while(b!=0){
            temp = b;
            b= a%b;
            a= temp;
        }
        return a;
    }
}
